package com.example.demo.algorithm;

import java.util.*;

/**
 * @atuthor: mac
 * Create:  2020-05-13  19:26
 * Email: wangbo@unicloud.com
 */
public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(m > n) {
            return;
        }
        int k = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            if (list.contains(x)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
