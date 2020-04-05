package com.user.javacore.chapter28;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class MainRecursiveTask {
    public static void main(String[] args) {
        final ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Double summ = forkJoinPool.invoke(new SummRecursiveTask(arr, 0, arr.length));
        System.out.println(summ);
//        System.out.println(Arrays.stream(arr).sum());
//        System.out.println(Arrays.stream(arr).count());
//        assert Arrays.stream(arr).sum() == summ;
    }
}
