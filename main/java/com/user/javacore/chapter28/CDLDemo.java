package com.user.javacore.chapter28;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cd = new CountDownLatch(5);

        new Thread(new MyThread(cd), "MyThread").start();

        try{
            cd.await();
        } catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Main thread finish work");
    }
}
