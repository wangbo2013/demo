package com.example.demo;

/**
 * @atuthor: mac
 * Create:  2020-05-14  20:14
 * Email: wangbo@unicloud.com
 */
public class Singleton {
    private Singleton(){
    }
    public static Singleton getInstance(){
        return Inner.instance;
    }
    private static class Inner {
        private static final Singleton instance = new Singleton();
    }
}
