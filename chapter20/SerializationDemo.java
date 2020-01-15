package main.java.com.user.javacore.chapter20;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 13);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test.txt"))){
            System.out.println(cat);
            objectOutputStream.writeObject(cat);
        } catch (IOException e){
            System.out.println("error seriliazarion " + e);
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test.txt"))){
            Cat cat2 = (Cat) objectInputStream.readObject();
            System.out.println(cat2);
        } catch (IOException e2){
            System.out.println("error deseriliazation " + e2);
        } catch (ClassNotFoundException e3){
            System.out.println("error class not found " + e3);
        }
    }
}
