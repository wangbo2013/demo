package com.example.demo.algorithm;

import java.util.Scanner;

/**
 * @atuthor: mac
 * Create:  1/27/21  6:19 PM
 * Email: wangbo@unicloud.com
 */
public class Solution8 {
    public static void main(String[] args) {
        int m;
        double sum,n;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            n=sc.nextInt();
            m=sc.nextInt();
            sum=0;
            for(int i=0;i<m;i++){
                sum=sum+n;
                n=Math.sqrt(n);
            }
            System.out.printf("%.2f",sum);
            System.out.println();
        }
    }
}
