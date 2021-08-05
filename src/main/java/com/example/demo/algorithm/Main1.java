package com.example.demo.algorithm;

import java.util.Scanner;

public class Main1 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int[] twoPeopleWalkAlon(int[] intArray1, int[] intArray2) {

        int sum1 = 0;
        for (int i = 0; i<intArray1.length;i++) {
            sum1 +=intArray1[i];
        }
        int sum2 = 0;
        for (int i = 0; i<intArray2.length;i++) {
            sum2 +=intArray2[i];
        }
        int arrItem1 = 0;
        int arrItem2 = 0;

        if (sum1 > sum2) {
            for (int i = 0; i<intArray1.length;i++) {
                int item1 = intArray1[i];
                for (int j = 0; i<intArray2.length;j++) {
                    int item2 = intArray2[j];
                    if ((item1 - item2) == (sum1 - sum2 - 1)) {
                        arrItem1 = item1;
                        arrItem2 = item2;
                    }
                }
            }
        } else if (sum1 < sum2){
            for (int i = 0; i<intArray1.length;i++) {
                int item1 = intArray1[i];
                for (int j = 0; i<intArray2.length;j++) {
                    int item2 = intArray2[j];
                    if ((item2 - item1) == (sum2 - sum1 - 1)) {
                        arrItem1 = item1;
                        arrItem2 = item2;
                    }
                }
            }
        }

        int[] result = new int[]{arrItem1, arrItem2};

        return result;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] res;

        int _intArray1_size = 0;
        _intArray1_size = Integer.parseInt(in.nextLine().trim());
        int[] _intArray1 = new int[_intArray1_size];
        int _intArray1_item;
        for(int _intArray1_i = 0; _intArray1_i < _intArray1_size; _intArray1_i++) {
            _intArray1_item = Integer.parseInt(in.nextLine().trim());
            _intArray1[_intArray1_i] = _intArray1_item;
        }

        int _intArray2_size = 0;
        _intArray2_size = Integer.parseInt(in.nextLine().trim());
        int[] _intArray2 = new int[_intArray2_size];
        int _intArray2_item;
        for(int _intArray2_i = 0; _intArray2_i < _intArray2_size; _intArray2_i++) {
            _intArray2_item = Integer.parseInt(in.nextLine().trim());
            _intArray2[_intArray2_i] = _intArray2_item;
        }

        res = twoPeopleWalkAlon(_intArray1, _intArray2);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}

