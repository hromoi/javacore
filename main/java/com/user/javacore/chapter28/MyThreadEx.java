package com.user.javacore.chapter28;

import java.util.concurrent.CountDownLatch;

public class MyThreadEx implements Runnable {

    private CountDownLatch cdl;
    private String name;

    public MyThreadEx(CountDownLatch cdl, String name){
        this.cdl = cdl;
        this.name = name;
    }

    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " execute " + i);
            cdl.countDown();
        }
    }
}
