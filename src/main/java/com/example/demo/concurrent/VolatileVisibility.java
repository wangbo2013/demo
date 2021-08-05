package com.example.demo.concurrent;

/**
 * @author : mac
 * create at:  2019-12-18  18:05
 * @description: volatile可见性
 */
public class VolatileVisibility {

    private static volatile boolean initFlag = false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(".............wait");
                while (!initFlag) {

                }

                System.out.println("..............success");
            }
        }).start();

        Thread.sleep(2000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("...............start change initFlag");
                initFlag = true;
                System.out.println("...............change initFlag end");
            }
        }).start();
    }
}
