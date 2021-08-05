package com.example.demo;


import java.util.Collections;

/**
 * @atuthor: mac
 * Create:  2020-04-13  22:38
 * Email: wangbo@unicloud.com
 */
public class Demo07 {

    public static void main(String[] args) {
        nearestPalindromic("1234");
    }

    public static String nearestPalindromic(String n) {
        long value = Long.parseLong(n);
        int m = n.length() / 2;

        String result = "";
        System.out.println(Math.pow(10, m));
        String add = String.valueOf(value + (long)Math.pow(10, m));
        long addValue = Long.parseLong(buildString(add.toCharArray()));

        String sub = String.valueOf(value - (long) Math.pow(10, m));
        long subValue = Long.parseLong(buildString(sub.toCharArray()));

        //考虑降位
        if (n.length() > 1) {
            long devValue = Long.parseLong(String.join("", Collections.nCopies(n.length() - 1, "9")));
            if (subValue == value) {
                subValue = devValue;
            }

            if (Math.abs(value - subValue) > Math.abs(value - devValue)) {
                subValue = devValue;
            }
        }

        long middleValue = Long.parseLong(buildString(n.toCharArray()));

        long addMin = (long)Math.abs(value - addValue);
        if (addMin == 0) {
            addMin = Integer.MAX_VALUE;
        }

        long middleMmin = (long)Math.abs(value - middleValue);
        if (middleMmin == 0) {
            middleMmin = Integer.MAX_VALUE;
        }

        long subMin = (long)Math.abs(value - subValue);
        if (subMin == 0) {
            subMin = Integer.MAX_VALUE;
        }

        long min = Math.min(addMin, subMin);
        min = Math.min(min, middleMmin);

        if (min == addMin) {
            result = String.valueOf(addValue);
        }

        if (min == middleMmin) {
            result = String.valueOf(middleValue);
        }

        if (min == subValue) {
            result = String.valueOf(subValue);
        }

        System.out.println(result);
        return result;
    }

    public static String buildString(char[] chars) {
        int l = (chars.length + 1)/2;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < l; i++) {
            stringBuilder.append(chars[i]);
        }

        for(int i = 0; i < chars.length - l; i++) {
            stringBuilder.append(chars[chars.length - l - i - 1]);
        }
        return stringBuilder.toString();
    }
}
