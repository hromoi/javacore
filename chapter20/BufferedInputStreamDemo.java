package main.java.com.user.javacore.chapter20;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        String str = "This is number &copy; " + ", a &copy - no.\n";
        boolean marked = false;
        byte[] buf = str.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        try (BufferedInputStream buff = new BufferedInputStream(in)){
            int c;
            while ((c = buff.read()) != -1){
//                System.out.print(((char) c));
                switch (c){
                    case '&':
                        if (!marked){
                            buff.mark(32);
                            marked = true;
                        } else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if (marked){
                            marked = false;
                            System.out.print("(c)");
                        } else {
                            System.out.print(((char) c));
                        }
                        break;
                    case ' ':
                        if (marked){
                            marked = false;
                            buff.reset();
                            System.out.print("&");
                        } else {
                            System.out.print(((char) c));
                        }
                        break;
                    default:
                        if (!marked)
                            System.out.print(((char) c));
                        break;
                }
            }
        } catch (IOException e){
            System.out.println("error i/o " + e);
        }
    }
}
