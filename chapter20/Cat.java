package main.java.com.user.javacore.chapter20;

import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat: " + name + " " + age;
    }
}
