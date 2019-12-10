package main.java.com.user.javacore.chapter13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile2 {
    public static void main(String[] args){
        File file;
        FileInputStream fileInputStream = null;
        int i;
        try {
            file = new File("/Users/user/Desktop/test23.txt");
            fileInputStream = new FileInputStream(file);
            do {
                i = fileInputStream.read();
                System.out.println(((char) i));
            } while (i != -1);
        } catch(FileNotFoundException o){
            System.out.println("not found file");
        } catch(IOException o2){
            System.out.println("Error reading file");
        } finally {
            try {
                if (fileInputStream != null) fileInputStream.close();
            } catch(IOException o3){
                System.out.println("Error closing file");
            }
        }
    }
}
