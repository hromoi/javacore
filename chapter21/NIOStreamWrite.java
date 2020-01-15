package main.java.com.user.javacore.chapter21;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class NIOStreamWrite {
    public static void main(String[] args) {
        String str = "Russia";
        byte[] arr = str.getBytes();
        try (BufferedOutputStream stream = new BufferedOutputStream(Files.newOutputStream(Paths.get("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter21/test.txt")))){
            stream.write(arr);
        } catch (InvalidPathException e){
            System.out.println("error path " + e);
        } catch (IOException e2){
            System.out.println("error i/o " + e2);
        }
    }
}
