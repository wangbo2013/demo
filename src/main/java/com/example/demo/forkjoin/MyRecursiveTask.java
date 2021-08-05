package com.example.demo.forkjoin;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * @atuthor: mac
 * Create:  1/8/21  2:37 PM
 * Email: wangbo@unicloud.com
 */
public class MyRecursiveTask extends RecursiveTask<Integer> {

    private Integer start;

    private Integer end;


    public MyRecursiveTask(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {

        Integer sum = 0;
        if (end - start < 1) {
            for(int i = start; i <= end; i++) {
                sum+=i;
            }
        } else {
            Integer middle = (start + end) / 2;
            MyRecursiveTask left = new MyRecursiveTask(start, middle);
            left.fork();
            MyRecursiveTask right = new MyRecursiveTask(middle + 1, end);
            right.fork();

            sum = left.join() + right.join();
        }
        return sum;
    }
}
