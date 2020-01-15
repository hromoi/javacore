package main.java.com.user.javacore.chapter20;

import java.io.*;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) throws IOException{
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str = "hello this messagedfgfdgdfsgfdgdfgfdgfdgfdsgsdfgfdsgfdsgfsdgdfgdfgggdgfdfgdfgdfgdfgsdsfgfgddfsg";
        byte[] arr = str.getBytes();
        try {
            byteArrayOutputStream.write(arr);
        } catch (IOException e){
            System.out.println("error i/o " + e);
        }
        System.out.println(byteArrayOutputStream.toString());
        byte[] arr3 = byteArrayOutputStream.toByteArray();
        byte[] arr4 = new byte[byteArrayOutputStream.toByteArray().length];
        try (FileOutputStream fileOutputStream = new FileOutputStream("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test.txt")){
            byteArrayOutputStream.writeTo(fileOutputStream);
        } catch (IOException e){
            System.out.println("error i/o " + e);
        }
//        FileInputStream fileInputStream = new FileInputStream("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test.txt");
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
//        bufferedInputStream.read();
        }
}
