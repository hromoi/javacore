package com.user.javacore.chapter28;

public class ProdCon {
    public static void main(String[] args) {
        Queue queue = new Queue();

        new Producer(queue, "Producer");
        new Consumer(queue, "Consumer");
    }
}
