package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @atuthor: mac
 * Create:  1/27/21  10:01 PM
 * Email: wangbo@unicloud.com
 */
public class Demo11 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, 6, 7, 8);

        List<Integer> list2 = list.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        }).collect(Collectors.toList());

        System.out.println(list2);

    }
}
