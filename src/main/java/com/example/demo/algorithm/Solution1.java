package com.example.demo.algorithm;

import java.util.Stack;

/**
 * 有效的括号--使用栈实现
 *
 * @atuthor: mac
 * Create:  2020-05-03  22:39
 * Email: wangbo@unicloud.com
 */
public class Solution1 {

    public static void main(String[] args) {
        System.out.println(isValid("{}[]{}({)"));
    }

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(char c : chars){
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if(c == '{'){
                stack.push('}');
            } else if(stack.isEmpty() || c != stack.pop()){
                return false;
            }
        }

        return stack.empty();

    }
}
