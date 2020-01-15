package main.java.com.user.javacore.chapter20;

import java.io.CharArrayReader;
import java.io.IOException;
import java.nio.Buffer;

public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String str = "hello world";
//        char[] arr2 = str.toCharArray();
        char[] arr = new char[str.length()];
        str.getChars(0, str.length(), arr, 0);
        try (CharArrayReader charArrayReader = new CharArrayReader(arr)){
            int c;
            while ((c = charArrayReader.read()) != -1)
                System.out.print(((char) c));
        } catch (IOException e){
            System.out.println("error i/o " + e);
        }
     }
}
