package com.user.javacore.chapter28;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyThreadCyclicByrrier implements Runnable {

    String name;
    CyclicBarrier cb;

    public MyThreadCyclicByrrier(CyclicBarrier cb, String name){
        this.name = name;
        this.cb = cb;
    }

    public void run(){
        System.out.println(name);
        try{
            cb.await();
        } catch (InterruptedException e){
            e.printStackTrace();
        } catch (BrokenBarrierException e){
            e.printStackTrace();
        }
    }
}
