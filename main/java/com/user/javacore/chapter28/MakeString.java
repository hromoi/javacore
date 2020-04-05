package com.user.javacore.chapter28;

import java.util.concurrent.Exchanger;

public class MakeString implements Runnable {

    private Exchanger<String> ex;
    private String name;
    private String result = new String();

    public MakeString(Exchanger<String> ex, String name){
        this.name = name;
        this.ex = ex;
    }

    public void run(){
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                result += ch++;
            }
            try {
                ex.exchange(result);
            } catch (InterruptedException e){
                System.out.println("error for sent");
            }
            result = new String();
        }
    }
}
