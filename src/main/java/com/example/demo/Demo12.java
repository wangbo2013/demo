package com.example.demo;

import java.util.concurrent.TimeUnit;

/**
 * @atuthor: mac
 * Create:  3/9/21  8:24 PM
 * Email: wangbo@unicloud.com
 */
public class Demo12 {
    //A、B 表示两把锁
    String A = "A";
    String B = "B";

    public static void main(String[] args) {
        Demo12 testMian = new Demo12();
        new Thread(() -> {
            try {
                testMian.a();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                testMian.b();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }


    public void a() throws InterruptedException {
        //持有锁A后，尝试持有锁B   ***********重点**************
        synchronized (A) {
            System.out.println("A");
            TimeUnit.SECONDS.sleep(1);
            synchronized (B) {
                System.out.println("B");
            }
        }
    }

    public void b() throws InterruptedException {
        //持有锁B后，尝试持有锁A   ***********重点**************
        synchronized (B) {
            System.out.println("B");
            TimeUnit.SECONDS.sleep(1);
            synchronized (A) {
                System.out.println("A");
            }
        }
    }
}
