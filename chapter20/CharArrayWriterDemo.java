package main.java.com.user.javacore.chapter20;

import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        String str = "hello, it's me";
        char[] arr = str.toCharArray();

        CharArrayWriter charArrayWriter = new CharArrayWriter();
        try {
            charArrayWriter.write(arr);
        } catch (IOException e){
            System.out.println("error i/o " + e);
        }

        try (FileWriter fileWriter = new FileWriter("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test.txt"); FileReader fileReader = new FileReader("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test2.txt")){
            charArrayWriter.writeTo(fileWriter);
            int c;
            while ((c = fileReader.read()) != -1)
                fileWriter.write(c);
        } catch (IOException e){
            System.out.println("error i/o " + e);
        }
    }
}
