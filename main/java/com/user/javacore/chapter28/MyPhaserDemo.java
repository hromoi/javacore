package com.user.javacore.chapter28;

import java.util.concurrent.Phaser;

public class MyPhaserDemo implements Runnable{

    Phaser ph;
    String name;


    public MyPhaserDemo(Phaser ph, String name){
        this.ph = ph;
        this.name = name;
    }

    public void run(){
        System.out.println("start first phase" + " for " + name + " thread");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        ph.arriveAndAwaitAdvance();
        System.out.println("start second phase" + " for " + name + " thread");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        ph.arriveAndAwaitAdvance();
        System.out.println("start third phase" + " for " + name + " thread");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        ph.arriveAndDeregister();
    }
}
