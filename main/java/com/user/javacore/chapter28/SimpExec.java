package com.user.javacore.chapter28;

import java.util.concurrent.*;

public class SimpExec {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(3);
        CountDownLatch cdl1 = new CountDownLatch(3);
        CountDownLatch cdl2 = new CountDownLatch(3);
        CountDownLatch cdl3 = new CountDownLatch(3);
        ExecutorService es = Executors.newFixedThreadPool(2);
        System.out.println(ForkJoinPool.getCommonPoolParallelism());
        es.execute(new MyThreadEx(cdl, "A"));
        es.execute(new MyThreadEx(cdl1, "B"));
        es.execute(new MyThreadEx(cdl2, "C"));
        es.execute(new MyThreadEx(cdl, "D"));

        try {
            cdl.await();
            cdl1.await();
            cdl2.await();
            cdl3.await();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        es.shutdownNow();
        System.out.println("finish all thread");
    }
}
