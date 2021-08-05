package com.example.demo.thread;


import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 线程创建方式
 * @atuthor: mac
 * Create:  1/9/21  6:09 PM
 * Email: wangbo@unicloud.com
 */
public class ThreadTest {

    static class Thread1 extends Thread {
        @Override
        public void run() {
            System.out.println("Thread1");
        }
    }


    static class Thread2 implements Runnable {

        @Override
        public void run() {
            System.out.println("Thread2");
        }
    }

    static class Thread3 implements Callable<String> {

        @Override
        public String call() throws Exception {
            return "Thread3";
        }
    }

    public static void main(String[] args) throws Exception {
        new Thread1().start();
        new Thread2().run();

        FutureTask futureTask = new FutureTask<>(new Thread3());
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());

    }
}
