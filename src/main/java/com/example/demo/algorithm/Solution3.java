package com.example.demo.algorithm;

import java.util.Scanner;

/**
 * 最大公约数和最小公倍数
 * <p>
 * 题目描述：
 * 最大公因数，也称最大公约数、最大公因子，指两个或多个整数共有约数中最大的一个。a、b的最大公约数记为（a，b），同样的，a、b、c的最大公约数记为（a，b，c），多个整数的最大公约数也有同样的记号。求最大公约数有多种方法，常见的有质因数分解法、短除法、辗转相除法、更相减损法。
 * <p>
 * 两个或多个整数公有的倍数叫做它们的公倍数，其中除0以外最小的一个公倍数就叫做这几个整数的最小公倍数。
 * <p>
 * 输入两个正整数m和n，求其最大公约数和最小公倍数。
 * <p>
 * 输入
 * 输入两个正整数
 * <p>
 * 输出
 * 最大公约数
 * <p>
 * 最小公倍数
 * <p>
 * 说明：分为两行显示
 * <p>
 * 样例输入
 * 4 8
 * 样例输出
 * 4
 * 8
 *
 * @atuthor: mac
 * Create:  2020-05-12  22:02
 * Email: wangbo@unicloud.com
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(getGcd(m, n));
        System.out.println(getLcd(m, n));
    }

    private static int getGcd(int m, int n) {
        int max = Math.max(m, n);
        int min = Math.min(m, n);
        if (max % min != 0) {
            return getGcd(min, max % min);
        } else {
            return min;
        }
    }

    private static int getLcd(int m, int n) {
        return m * n / getGcd(m, n);
    }
}
