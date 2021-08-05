package com.example.demo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @atuthor: mac
 * Create:  2020-05-14  20:03
 * Email: wangbo@unicloud.com
 */
public class Demo10 {
    public static void main(String[] args) {
        String str = "eeaddabccccaaeec";
        //print(str);
    }

    public static void print(String str) {
        TreeMap<String, Long> result = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
        StringBuffer sb = new StringBuffer();
        result.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue())
                .forEachOrdered(map -> {
                    sb.append(map.getKey());
                });
        System.out.println(sb.toString());
    }
}
