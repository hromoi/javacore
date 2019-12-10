package main.java.com.user.javacore.chapter13;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Usage: ShowFile name_file");
            return ;
        }
        FileInputStream fileInputStream;
        String str;
        try {
            fileInputStream = new FileInputStream(args[1]);
        } catch (FileNotFoundException e){
            System.out.println("not possible open file");
            return ;
        }

        try {
            do {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                str = bufferedReader.readLine();
            } while (str.equals("stop"));
        } catch (IOException e1){
            System.out.println("error read file");
        }

        try {
            fileInputStream.close();
        } catch (IOException e2){
            System.out.println("error read file");
        }
    }
}
