package com.user.javacore.chapter28;

public class Consumer implements Runnable {
    String name;
    Queue queue;

    public Consumer(Queue queue, String name){
        this.queue = queue;
        this.name = name;
        new Thread(this, name).start();
    }

    public void run(){
        for (int i = 0; i < 20; i++) {
            queue.get();
        }
    }
}
