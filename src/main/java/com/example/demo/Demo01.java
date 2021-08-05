package com.example.demo;


/**
 * @author : mac
 * create at:  2019-12-16  18:10
 * @description:
 */
public class Demo01 {

    public static void main(String[] args) {
        long maxMemory = Runtime.getRuntime().maxMemory();

        long totalMemory = Runtime.getRuntime().totalMemory();
        // 电脑核数
        long available = Runtime.getRuntime().availableProcessors();
        System.out.println("maxMemory=" + maxMemory/(double)1024/1024 + "Mb");
        System.out.println("totalMemory=" + totalMemory/(double)1024/1024 + "Mb");
        System.out.println(available/2);
    }
}
