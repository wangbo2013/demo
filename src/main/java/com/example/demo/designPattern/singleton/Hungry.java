package com.example.demo.designPattern.singleton;

/**
 * @author : mac
 * create at:  2019-12-16  15:23
 * @description: 单例模式  饿汉式
 */
public class Hungry {

    private Hungry() {
    }

    private static final Hungry hungry = new Hungry();

    public static Hungry getInstance() {
        return hungry;
    }
}
