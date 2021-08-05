package com.example.demo.concurrent;


import sun.misc.Unsafe;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.LockSupport;

/**
 * @author : mac
 * create at:  2019-12-19  18:13
 * @description: 自定义锁
 */
public class CustomLock {

    /**
     * 当前加锁的状态，记录加锁的次数
     */
    private volatile int state = 0;

    /**
     * 当前持有锁的线程
     */
    private Thread lockHolder;

    /**
     * 等待的线程链表
     */
    private ConcurrentLinkedQueue<Thread> waiters = new ConcurrentLinkedQueue<>();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Thread getLockHolder() {
        return lockHolder;
    }

    public void setLockHolder(Thread lockHolder) {
        this.lockHolder = lockHolder;
    }

    private boolean aquireState() {
        int state = getState();
        Thread current = Thread.currentThread();
        if (state == 0) {
            if ((waiters.isEmpty() || current == waiters.peek()) && compareAndSwapState(0, 1)) {
                //加锁成功
                setLockHolder(current);
                return true;
            }
        }
        return false;
    }

    /**
     * 加锁
     */
    public void lock() {
        if (aquireState()) {
            return;
        }

        //加锁没有成功的线程请求
        Thread current = Thread.currentThread();
        //入队，等待
        waiters.add(current);

        while (true) {
            if (waiters.peek() == current && aquireState()) {
                //移除并返问队列头部的线程
                waiters.poll();
                return;
            }
            //线程waiting
            LockSupport.park();
        }

    }

    /**
     * 解锁
     */
    public void unLock() {
        if (Thread.currentThread() != lockHolder) {
            throw new RuntimeException("Error");
        }

        int state = getState();
        if(compareAndSwapState(1, 0)){
            setLockHolder(null);
            //取出队头线程
            Thread current = waiters.peek();
            if(current != null) {
                //唤醒
                LockSupport.unpark(current);
            }
        }
    }

    /**
     * 原子操作
     *
     * @param except
     * @param update
     * @return
     */
    public final boolean compareAndSwapState(int except, int update) {
        return unsafe.compareAndSwapInt(this, stateOffset, except, update);
    }


    private static final Unsafe unsafe = Unsafe.getUnsafe();

    private static long stateOffset;

    static {
        try {
            stateOffset = unsafe.objectFieldOffset(CustomLock.class.getDeclaredField("state"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
