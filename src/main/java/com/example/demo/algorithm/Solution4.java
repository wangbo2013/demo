package com.example.demo.algorithm;

import java.util.Scanner;

/**
 * @atuthor: mac
 * Create:  2020-05-13  07:29
 * Email: wangbo@unicloud.com
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.next();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                String ss = str.substring(0, length - i);
                StringBuffer sb = new StringBuffer(ss);
                String s1 = sb.reverse().toString();
                if (ss.equals(s1)) {
                    System.out.println(length - i);
                    break;
                }
            }
        }
        sc.close();
    }
}
