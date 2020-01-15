package main.java.com.user.javacore.chapter20;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStreamDemo {
    public static void main(String[] args) {
        String str = "hello == how = are == you?";
        byte[] arr = str.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);
        int c;
        boolean marked = false;
//        int len = str.length();
//        System.out.println(len);
        try (PushbackInputStream pushbackInputStream = new PushbackInputStream(byteArrayInputStream, str.length())){
            while ((c = pushbackInputStream.read()) != -1){
                switch (c) {
                    case '=':
                        if ((c = pushbackInputStream.read()) == '=')
                            System.out.print(".eq.");
                        else{
                            System.out.print("<-");
                        }
                        break;
                    default:
                        System.out.print(((char) c));
                        break;
                }
            }
            pushbackInputStream.unread(arr);
            while ((c = pushbackInputStream.read()) != -1){
                switch (c) {
                    case '=':
                        if ((c = pushbackInputStream.read()) == '=')
                            System.out.print(".eq.");
                        else{
                            System.out.print("<-");
                        }
                        break;
                    default:
                        System.out.print(((char) c));
                        break;
                }
            }
        } catch (IOException e){
            System.out.println("error i/o " + e);
        }
    }
}
