package com.user.javacore.chapter28;

import java.util.concurrent.Semaphore;

public class Queue {
    int n;

    static Semaphore semCon = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);

    void get(){
        try {
            semCon.acquire();
            Thread.sleep(10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Recieved " + n);
        semProd.release();

    }

    void put(int n){
        try{
//            System.out.println(n);
//            System.out.println("semProd " + semProd.getQueueLength() + "\n");
            if (n != 0)
                System.out.println("semProd is wait");
            semProd.acquire();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        this.n = n;
        System.out.println("Sent " + n);
        semCon.release();
        System.out.println("semCon " + semCon.getQueueLength() + "\n");
    }
}
