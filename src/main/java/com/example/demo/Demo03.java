package com.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : mac
 * create at:  2020-01-14  10:48
 * @description:
 */
public class Demo03 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("<script[\\s\\S]*?>[\\s\\S]*?<\\/script>", Pattern.CASE_INSENSITIVE);
        Pattern pattern1 = Pattern.compile("[a-zA-Z]*<.*?>[a-zA-Z]*", Pattern.CASE_INSENSITIVE);
        Pattern pattern2 = Pattern.compile("/<(?:[^>'\"]|\"[^\"]*\"|'[^']*')*>/g", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher("<script></script>");
        Matcher matcher1 = pattern1.matcher("script");
        Matcher matcher2 = pattern2.matcher("<script>");
        //System.out.println(matcher.matches());
        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
    }
}
