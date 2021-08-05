package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @atuthor: mac
 * Create:  2020-03-27  20:31
 * Email: wangbo@unicloud.com
 */
public class Demo06 {
    public static void main(String[] args) {
        int[] a0 = new int[5];
        System.out.println("a0的长度为" + a0.length);

        int[] a1 = {1, 2, 4, 3};
        System.out.println("a1的长度为" + a1.length);

        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }

        for (int i : a1) {
            System.out.println(i);
        }

        Arrays.sort(a1);


        List<Integer> v0 = new ArrayList<>();
        List<Integer> v1;
        Integer[] a = {1, 2, 3, 4};
        v1 = new ArrayList<>(Arrays.asList(a));
        v1.set(1, 0);
        for (int i = 0; i < v1.size(); i++) {
            System.out.println(v1.get(i));
        }
    }
}
