package com.user.javacore.chapter28;

import java.util.concurrent.Semaphore;

public class DecThread implements Runnable {
    private String name;
    private Semaphore sm;

    public DecThread(Semaphore sm, String name){
        this.sm = sm;
        this.name = name;
        System.out.println("init thread " + name);
        new Thread(this, name).start();
    }

    @Override
    public void run(){
        try {
            System.out.println("thread " + name + " ready for start");
//            sm.acquire();
            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println("shared count " + Shared.count);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println(e);
        }
//        sm.release();
        System.out.println("thread " + name + " unlock shared count");
    }
}
