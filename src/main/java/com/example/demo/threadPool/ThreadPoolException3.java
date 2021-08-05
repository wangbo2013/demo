package com.example.demo.threadPool;

import java.util.concurrent.*;

/**
 * @atuthor: mac
 * Create:  2020-04-28  15:14
 * Email: wangbo@unicloud.com
 *
 * 线程池异常处理方式3，重写afterExecute方法,注意如果是submit提交要额外处理
 */
public class ThreadPoolException3 {

    public static void main(String[] args) {
        //execute异常处理
        ExecutorService executorService2 = new ThreadPoolExecutor(1, 1, 0,
                TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>()){
            @Override
            protected void afterExecute(Runnable r, Throwable t) {
                super.afterExecute(r, t);
                System.out.println("execute异常为" + t.getMessage());
            }
        };

        executorService2.execute(() -> {
            int i = 1/0;
        });


        //submit异常处理
        ExecutorService executorService3 = new ThreadPoolExecutor(1, 1, 0,
                TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>()) {
            @Override
            protected void afterExecute(Runnable r, Throwable t) {
                super.afterExecute(r, t);
                //execute提交的时候
                if(t != null) {
                    System.out.println("execute异常" + t.getMessage());
                }


                //如果r的实际类型是FutureTask 那么是submit提交的，所以可以在里面get到异常
                if (r instanceof FutureTask) {
                    try {
                        Future future = (Future) r;
                        future.get();
                    } catch (Exception e) {
                        System.out.println("submit异常" + e.getMessage());
                    }
                }
            }
        };

        executorService3.submit(() -> {
            int i = 1/0;
        });

    }
}
