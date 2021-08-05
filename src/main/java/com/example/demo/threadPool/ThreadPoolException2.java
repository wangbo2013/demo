package com.example.demo.threadPool;

import java.util.concurrent.*;

/**
 * @atuthor: mac
 * Create:  2020-04-28  15:14
 * Email: wangbo@unicloud.com
 *
 * 线程池异常处理方式2
 * UncaughtExceptionHandler方式  execute()能捕获到异常、submit()不能捕获到异常
 */
public class ThreadPoolException2 {

    public static void main(String[] args) {

        //实现自己的一个线程池工厂
        ThreadFactory factory = (Runnable r) -> {
            Thread thread = new Thread(r);
            thread.setUncaughtExceptionHandler((Thread t, Throwable throwable) ->{
                System.out.println("线程池工厂设置" + throwable.getMessage());
            });
            return thread;
        };

        ExecutorService executorService = new ThreadPoolExecutor(1, 1, 0,
                TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(10), factory);
        executorService.submit(() -> {
            int i = 10/0;
        });
        executorService.submit(() -> {
            System.out.println("当线程池抛出异常后执行新的任务(submit)");
        });

        ExecutorService executorService1 = new ThreadPoolExecutor(1, 1, 0,
                TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(10), factory);
        executorService1.execute(() -> {
            int i = 10/0;
        });
        executorService1.execute(() -> {
            System.out.println("当线程池抛出异常后执行新的任务(execute)");
        });
    }
}
