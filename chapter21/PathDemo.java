package main.java.com.user.javacore.chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {
        Path filepath = Paths.get("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter21/test.txt");

        System.out.println(filepath.getName(11));
        System.out.println(filepath);
        System.out.println(filepath.toAbsolutePath());
        System.out.println(filepath.getFileName());
        System.out.println(filepath.getParent());

        System.out.println(Files.exists(filepath));
        try {
            System.out.println(Files.isHidden(filepath));
        } catch (IOException e){
            System.out.println("error i/o " + e);
        }
        System.out.println(Files.isWritable(filepath));
        System.out.println(Files.isReadable(filepath));

        try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes(filepath, BasicFileAttributes.class);
            System.out.println(basicFileAttributes.isRegularFile());
            System.out.println(basicFileAttributes.isDirectory());
            System.out.println(basicFileAttributes.isSymbolicLink());
            System.out.println(basicFileAttributes.size());
            System.out.println(basicFileAttributes.lastModifiedTime());
        } catch (IOException e2){
            System.out.println("error i/o " + e2);
        }
    }
}
