package com.example.demo.thread;

import java.util.concurrent.TimeUnit;

/**
 * @atuthor: mac
 * Create:  1/15/21  6:57 PM
 * Email: wangbo@unicloud.com
 */
public class ThreadTest1 {

    public static void main(String[] args) {
        System.out.println("main enter");

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("t1 is executing");
                    try {
                        TimeUnit.MINUTES.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.setDaemon(true);
        t1.start();
        System.out.println("main exit");
    }
}
