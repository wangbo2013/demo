package com.example.demo;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @atuthor: mac
 * Create:  2020-04-20  23:33
 * Email: wangbo@unicloud.com
 */
public class Demo08 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3, 1, 2, 3};
        int val = 3;
        //System.out.println(removeElement(nums, val));
        System.out.println(reverse(1534236469));
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        List<Integer> list = IntStream.of(nums).boxed().collect(Collectors.toList());
        for (Integer i = 0; i < list.size(); i++) {
            Integer item = list.get(i);
            if (item == val) {
                list.remove(item);
            }
        }
        return list.size();

    }

    /**
     * 反转整数
     * @param x
     * @return
     *
     * 解题思路
     * 123456789
     * 987654321
     * 要逆序，就到倒着把数字一个个取出来，9，8，7...，再放在末位，也就是个位数上：9，98，987
     * 所以先把个位拿到，通过x%10 1234 % 10 = 4
     * 第一次拿了9，原来的x要变成12345678，通过x/10可以得到12345678
     * 怎么把9、8变成98，通过 9*10 + 8 其中8也是通过x%10拿到的
     * 以此类推，，，所以整数逆序也可以不用字符串来做
     */
    public static int reverse(int x) {
        long n = 0;
        while (x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) ? 0 : (int)n;
    }
}
