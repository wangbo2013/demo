package com.example.demo.algorithm;

import java.util.Scanner;

/**
 * 热与冷
 * 题目描述：
 *
 * 卡尔、卡罗琳、海伦和汉是四个朋友，共享一个房间。工作区有一个恒温器，可以将其设置为35华氏度到95华氏度（包括华氏度）之间的任何整数温度。
 *
 * 这四个朋友不能统一房间的温度！ 卡尔和卡罗琳不希望它太冷，而海伦和汉不希望它太热。 特别：
 *
 * 卡尔希望温度至少为华氏c1度。
 *
 * 卡罗琳希望温度至少为华氏c2度。
 *
 * 海伦希望它的最大华氏度为h1度。
 *
 * 汉希望它最大是华氏h2度。
 *
 * 给定c1、c2、h1和h2，是否有令四个朋友都满意的温度？如果有，请打印YES；否则，打印NO。
 *
 * 输入
 * 四个空格分隔的整数，分别描述c1、c2、h1和h2的值。
 *
 * 约束条件
 *
 * 35<=c1,c2,h1,h2<=95
 * 输出
 * 如果可以满足所有四个朋友的条件，则打印YES； 否则，请打印NO。
 *
 * 样例输入
 * 50 40 70 60
 * 样例输出
 * YES
 * @atuthor: mac
 * Create:  2020-05-12  21:54
 * Email: wangbo@unicloud.com
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        if (Math.max(c1, c2) <= Math.min(h1, h2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
