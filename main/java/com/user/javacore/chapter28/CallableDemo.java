package com.user.javacore.chapter28;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        Future<Integer> ft = es.submit(new CallDemo(3));

        try {
            System.out.println(ft.get());
        } catch (InterruptedException e){
            e.printStackTrace();
        } catch (ExecutionException e){
            e.printStackTrace();
        }
        es.shutdown();
    }
}
