package com.user.javacore.chapter28;

import java.util.concurrent.Exchanger;

public class UseString implements Runnable {
    private Exchanger<String> ex;
    private String name;
    private String str;

    public UseString(Exchanger<String> ex, String name){
        this.ex = ex;
        this.name = name;
    }

    public void run(){
        for (int i = 0; i < 3; i++) {
            try{
                str = ex.exchange(new String());
            } catch (InterruptedException e){
                System.out.println("error for received");
            }
            System.out.println("Получено: " + str);
        }
    }
}
