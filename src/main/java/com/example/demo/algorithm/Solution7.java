package com.example.demo.algorithm;

import java.util.Scanner;

/**
 * @atuthor: mac
 * Create:  2020-05-13  20:26
 * Email: wangbo@unicloud.com
 */
public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 0;
        int y = 0;
        for (int i = 1; i <= num; i++) {
            int n = sc.nextInt();
            if(i%4 == 1) {
                x = x + n;
                System.out.println(x + " " + y);
            } else if (i%4 == 2) {
                y = y + n;
                System.out.println(x + " " + y);
            }else if (i%4 == 3) {
                x = x - n;
                System.out.println(x + " " + y);
            }else if (i%4 == 0) {
                y = y - n;
                System.out.println(x + " " + y);
            }
        }
    }
}
