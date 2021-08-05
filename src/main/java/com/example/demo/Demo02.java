package com.example.demo;

import java.util.ArrayList;

/**
 * @author : mac
 * create at:  2019-12-16  18:00
 * @description:
 */
public class Demo02 {

    byte[] bytes = new byte[1024*100];

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Demo02> list = new ArrayList<>();
        while (true) {
            list.add(new Demo02());
            //Thread.sleep(50);

        }

    }
}
