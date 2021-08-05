package com.example.demo.concurrent;

/**
 * @author : mac
 * create at:  2019-12-18  18:05
 * @description: volatile不能保证原子性，如果需要保证原子性需要借助synchronized(锁机制)关键字
 */
public class VolatileAtomic {

    private static volatile int num = 0;

    private static synchronized void increase() {
        num++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        increase();
                    }
                }
            });

            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println(num);
    }
}