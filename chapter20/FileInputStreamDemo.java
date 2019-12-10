package main.java.com.user.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        
        try (FileInputStream fileInputStream = new FileInputStream("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test.txt")){
            System.out.println("collichestvo dostypnih bayt " + (size = fileInputStream.available()));
            int count = size / 2;
            for(int i = 0; i < count; i++){
                System.out.println(((char) fileInputStream.read()));
            }
            System.out.println("dostupno " + (size = fileInputStream.available()));
            fileInputStream.skip(1L);
            System.out.println("чтение следующих " + size + "байтов");
            byte[] arr = new byte[size];
            if (fileInputStream.read(arr) != size)
                System.out.println("error");
            else {
                for (byte iter: arr) {
                    System.out.println(((char) iter));
                }
            }

//            System.out.println(fileInputStream.available());
        } catch (IOException e){
            System.out.println("error input/output" + e);
        }
    }
}
