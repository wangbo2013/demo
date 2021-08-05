package com.example.demo.forkjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @atuthor: mac
 * Create:  1/8/21  2:38 PM
 * Email: wangbo@unicloud.com
 */
public class MyRecursiveTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Integer> taskFuture = pool.submit(new MyRecursiveTask(1, 4));

        System.out.println(taskFuture.get());
    }
}
