package com.example.demo.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @atuthor: mac
 * Create:  2020-04-14  20:22
 * Email: wangbo@unicloud.com
 */
public class ThreadPool01 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is my executor threadPool.");
            }
        });
        //executor.shutdown();
    }
}
