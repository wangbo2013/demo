package com.example.demo.designPattern.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 观察者模式
 * @atuthor: mac
 * Create:  1/19/21  3:23 PM
 * Email: wangbo@unicloud.com
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/createOrder")
    public String createOrder() {
        String orderId = "12312313";

        OrderCreateEvent orderCreateEvent = new OrderCreateEvent(orderId);
        applicationContext.publishEvent(orderCreateEvent);

        return "OK";
    }
}
