package main.java.com.user.javacore.chapter13;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;


//        if (args.length != 2){
//            System.out.println("Usage: copy File1 File2");
//            return ;
//        }
        try {
            fileInputStream = new FileInputStream("/Users/user/Desktop/test.txt");
            fileOutputStream = new FileOutputStream("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter13/test.txt");
            int read;
            do {
                read = fileInputStream.read();
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                if (read != -1) fileOutputStream.write(read);
            } while (read != -1);
        } catch (IOException o){
            System.out.println("Usage: copy File1 File2");
        } finally {
            try {
                if (fileInputStream != null) fileInputStream.close();
            } catch (IOException o1){
                System.out.println("Error closing first File");
            }
            try {
                if (fileOutputStream != null) fileOutputStream.close();
            } catch (IOException o2){
                System.out.println("Error closing second File");
            }
        }
    }
}
