package com.example.demo;

import java.util.Scanner;

/**
 * @atuthor: mac
 * Create:  2020-04-21  09:58
 * Email: wangbo@unicloud.com
 */
public class Demo09 {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','b','c','c'};
        System.out.println(compress(chars));
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        StringBuffer result = new StringBuffer();
//        //字符串长度
//        int length = str.length();
//        //连续字符串个数
//        int sum = 1;
//        //取第一个字符串
//        char word1 = str.charAt(0);
//
//        for(int i = 1; i < length; i++) {
//            char word2 = str.charAt(i);
//            if (word1 == word2) {
//                sum++;
//                continue;
//            }
//
//            result.append(word1).append(sum);
//            word1 = word2;
//            //连续字符串个数清零
//            sum = 1;
//        }
//        System.out.println('压缩后的字符串为' + result.toString());
    }

    public static int compress(char[] chars) {
        char word1 = chars[0];
        int sum = 1;
        StringBuffer result = new StringBuffer();
        for(int i=1; i<chars.length; i++) {
            char word2 = chars[i];
            if (word1 == word2) {
                sum++;
                continue;
            }

            result.append(word1).append(sum);
            word1 = word2;
            sum = 1;
            System.out.println(result.toString());
        }

        return result.toString().toCharArray().length;
    }
}
