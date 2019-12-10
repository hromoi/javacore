package main.java.com.user.javacore.chapter20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test.txt"); FileInputStream fileInputStream = new FileInputStream("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test2.txt")){
            String str = "hello";
            byte[] arr = str.getBytes();
            fileOutputStream.write(arr);
            byte[] array = new byte[fileInputStream.available()];
            fileInputStream.read(array);
            fileOutputStream.write(array);
        } catch (IOException e){
            System.out.println("error input/output " + e);
        }
    }
}
