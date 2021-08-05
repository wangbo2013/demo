package com.example.demo.designPattern.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @atuthor: mac
 * Create:  1/19/21  3:21 PM
 * Email: wangbo@unicloud.com
 */
@Component
public class OrderCreateListener implements ApplicationListener<OrderCreateEvent> {

    @Override
    public void onApplicationEvent(OrderCreateEvent event) {
        Object orderId = event.getSource();
        System.out.println("orderId is " + orderId);
    }
}
