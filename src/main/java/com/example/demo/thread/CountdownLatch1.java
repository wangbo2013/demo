package com.example.demo.thread;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 主线程等待子线程执行完毕才执行
 * @atuthor: mac
 * Create:  2020-05-02  17:26
 * Email: wangbo@unicloud.com
 */
public class CountdownLatch1 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        final CountDownLatch countDownLatch = new CountDownLatch(3);
        for (int i = 0; i < 3; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("子线程" + Thread.currentThread().getName() + "开始执行");
                        Thread.sleep((long) (Math.random() * 1000));
                        System.out.println("子线程" + Thread.currentThread().getName() + "执行完毕");
                        countDownLatch.countDown();//当前线程调用此方法，则计数减1
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        try {
            System.out.println("主线程" + Thread.currentThread().getName() + "等待子线程执行完毕");
            countDownLatch.await();//阻塞当前线程，直到计数器为1
            System.out.println("主线程" + Thread.currentThread().getName() + "开始执行");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
