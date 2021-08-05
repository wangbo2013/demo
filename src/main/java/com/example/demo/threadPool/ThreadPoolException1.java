package com.example.demo.threadPool;

import java.util.concurrent.*;

/**
 * @atuthor: mac
 * Create:  2020-04-28  15:14
 * Email: wangbo@unicloud.com
 *
 * 线程池异常处理方式1
 * trycatch方式  submit()和execute()都能捕获到异常
 */
public class ThreadPoolException1 {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(() -> {
            try {
                int i = 10/0;
            }catch (Exception e) {
                System.out.println("submit抛出异常" + e.getMessage());
            }
        });
        executorService.submit(() -> {
            System.out.println("当线程池抛出异常后执行新的任务(submit)");
        });

        ExecutorService executorService1 = Executors.newFixedThreadPool(1);
        executorService1.execute(() -> {
            try {
                int i = 10/0;
            } catch (Exception e) {
                System.out.println("execute抛出异常" + e.getMessage());
            }
        });
        executorService1.execute(() -> {
            System.out.println("当线程池抛出异常后执行新的任务(execute)");
        });
    }
}
