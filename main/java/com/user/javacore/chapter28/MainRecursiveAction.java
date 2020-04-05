package com.user.javacore.chapter28;

import java.util.concurrent.ForkJoinPool;

public class MainRecursiveAction {
    public static void main(String[] args) {
        ForkJoinPool fjp = ForkJoinPool.commonPool();
        double[] data = new double[10_000];
        for (int i = 0; i < 10_000; i++) {
            data[i] = i;
        }
        fjp.invoke(new SqrtTaskRecursiveAction(data, 0, data.length));
        for (int i = 0; i < 10; i++) {
            System.out.println(data[i]);
        }
    }
}
