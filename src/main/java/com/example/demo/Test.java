package com.example.demo;

/**
 * @atuthor: mac
 * Create:  2020-05-14  20:00
 * Email: wangbo@unicloud.com
 */
public class Test {
    public class Test2 extends Test {
        public Test2() {
            if (n == 0x10)
                n = 10;
            else
                n = 0_10;
        }
        public int get() { return n; }
    }

    int n = 0x10;
    public Test() { n = 0b10; }
    public static void main(String[] args) {
        final Test2 t2 = new Test().new Test2();
        System.out.println(t2.get());
        System.out.println(0x10);
        System.out.println(0b10);
    }
}
