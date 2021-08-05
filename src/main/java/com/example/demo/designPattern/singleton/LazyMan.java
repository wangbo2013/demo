package com.example.demo.designPattern.singleton;

/**
 * @author : mac
 * create at:  2019-12-16  15:24
 * @description: 单例模式 懒汉式(双重检查锁)
 */
public class LazyMan {

    private LazyMan() {
    }

    private volatile static LazyMan lazyMan;

    public static LazyMan getInstance() {
        if (lazyMan == null) {
            synchronized (LazyMan.class) {
                if (lazyMan == null) {
                    lazyMan = new LazyMan();
                }
            }
        }
        return lazyMan;
    }
}
