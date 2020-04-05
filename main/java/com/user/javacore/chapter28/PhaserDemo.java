package com.user.javacore.chapter28;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser ph = new Phaser(1);

        new Thread(new MyPhaserDemo(ph, "A")).start();
        new Thread(new MyPhaserDemo(ph, "B")).start();
        new Thread(new MyPhaserDemo(ph, "C")).start();

        int currph = ph.getPhase();
        ph.arriveAndAwaitAdvance();
        System.out.println("phase " + currph + " finish");

        currph = ph.getPhase();
        ph.arriveAndAwaitAdvance();
        System.out.println("phase " + currph + " finish");

        currph = ph.getPhase();
        ph.arriveAndDeregister();
        System.out.println("phase " + currph + " finish");
    }
}
