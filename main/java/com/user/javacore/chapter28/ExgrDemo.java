package com.user.javacore.chapter28;

import java.util.concurrent.Exchanger;

public class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();

        new Thread(new MakeString(ex, "makeString")).start();
        new Thread(new UseString(ex, "useString")).start();
    }
}
