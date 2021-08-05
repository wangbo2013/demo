package com.example.demo.algorithm;

import java.util.Scanner;

/**
 * 求题目描述：
 * 数列的定义如下： 数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。
 * 输入：输入数据有多组，每组占一行，由两个整数n（n<10000）和m(m<1000)组成，n和m的含义如前所述。
 * 输出：对于每组输入数据，输出该数列的和，每个测试实例占一行，要求精度保留2位小数。
 * @atuthor: mac
 * Create:  2020-05-13  19:05
 * Email: wangbo@unicloud.com
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        double sum, n;
        while (sc.hasNext()) {
            n = sc.nextInt();
            m = sc.nextInt();
            sum = 0;
            for (int i = 0; i < m; i++) {
                sum = sum + n;
                n = Math.sqrt(n);
            }
            System.out.printf("%.2f", sum);
            System.out.println();
        }
    }
}
