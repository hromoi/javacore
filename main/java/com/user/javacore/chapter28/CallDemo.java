package com.user.javacore.chapter28;

import java.util.concurrent.Callable;

public class CallDemo implements Callable<Integer> {

    int num;

    public CallDemo(int num){
        this.num = num;
    }

    public Integer call(){
        return num + num;
    }
}
