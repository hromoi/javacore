package com.user.javacore.chapter28;

import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

        new Thread(new MyThreadCyclicByrrier(cb, "A")).start();
        new Thread(new MyThreadCyclicByrrier(cb, "B")).start();
        new Thread(new MyThreadCyclicByrrier(cb, "C")).start();
    }
}
