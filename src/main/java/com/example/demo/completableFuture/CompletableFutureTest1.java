package com.example.demo.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * @atuthor: mac
 * Create:  1/17/21  5:15 PM
 * Email: wangbo@unicloud.com
 */
public class CompletableFutureTest1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        get1();
        System.out.println(get2());
    }

    private static void get1(){
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            System.out.println("test task is running");
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        try {
            future1.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static String get2() throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {

            @Override
            public String get() {
                return "test result";
            }
        });
        return future.get();
    }
}
