package com.example.demo.generic;

/**
 * 泛型接口
 * @atuthor: mac
 * Create:  8/5/21  11:16 PM
 */
public interface GenericInterface<T> {

    public T get();

    public void set(T t);

    public T delete(T t);
}
