package com.example.demo;


public class ThreadTest implements Runnable {
    static ThreadTest instance = new ThreadTest();

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.err.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public ThreadTest() {
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance, "thread1");
        t1.start();
        Thread t2 = new Thread(instance, "thread2");
        t2.start();
    }



}
