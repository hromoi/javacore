package main.java.com.user.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;

public class NIOCopy {
    public static void main(String[] args) {
//        if (args.length != 2)
//            System.out.println("usage: source destination copy");
//        else{
            try{
                Path src = Paths.get("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test.txt");
                Path dst = Paths.get("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/test.txt");
                Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);
            } catch (InvalidPathException e){
                System.out.println("error path " + e);
            } catch (IOException e2){
                System.out.println("error i/o " + e2);
            }
//        }
    }
}
