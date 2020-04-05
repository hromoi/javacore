package com.user.javacore.chapter28;

import java.util.concurrent.Semaphore;

public class SemDemo {
    public static void main(String[] args){
        Semaphore sm = new Semaphore(1);

        IncThread incThread = new IncThread(sm, "A");
        DecThread decThread = new DecThread(sm, "B");
    }
}
