package com.user.javacore.chapter28;

public class Producer implements Runnable {

    String name;
    Queue queue;

    public Producer(Queue queue, String name){
        this.name = name;
        this.queue = queue;
        new Thread(this, name).start();
    }

    public void run(){
        for (int i = 0; i < 20; i++) {
            queue.put(i);
        }
    }
}
