package com.example.demo.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @atuthor: mac
 * Create:  2020-04-29  11:03
 * Email: wangbo@unicloud.com
 * 两个线程交叉打印数字1-100
 */
public class CrossPrint implements Runnable {
    ReentrantLock reentrantLock = new ReentrantLock(true);
    private int i = 1;
    @Override
    public void run() {
        while (i < 100) {
            reentrantLock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + ": " + (i++));
            }finally {
                //reentrantLock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        CrossPrint crossPrint = new CrossPrint();
        Thread thread1 = new Thread(crossPrint, "Thread1");
        Thread thread2 = new Thread(crossPrint, "Thread2");
        thread1.start();
        thread2.start();
    }
}
