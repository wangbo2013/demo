package com.example.demo.designPattern.observer;

import org.springframework.context.ApplicationEvent;

/**
 * @atuthor: mac
 * Create:  1/19/21  3:20 PM
 * Email: wangbo@unicloud.com
 */
public class OrderCreateEvent extends ApplicationEvent {

    public OrderCreateEvent(Object source) {
        super(source);
    }
}
