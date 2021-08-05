package com.example.demo.threadPool;

import java.util.concurrent.*;

/**
 * @atuthor: mac
 * Create:  2020-04-28  15:14
 * Email: wangbo@unicloud.com
 *
 * 线程池异常处理
 */
public class ThreadPoolException {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        //submit不会抛异常
        executorService.submit(() -> {
            int i = 10/0;
        });

        executorService.submit(() -> {
            System.out.println("当线程池抛出异常后执行新的任务(submit)");
        });
        ExecutorService executorService1 = Executors.newFixedThreadPool(1);
        //execute会抛异常
        executorService1.execute(() -> {
            int i = 10/0;
        });

        executorService1.execute(() -> {
            System.out.println("当线程池抛出异常后执行新的任务(execute)");
        });

    }
}
