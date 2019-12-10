package main.java.com.user.javacore.chapter20;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dir = "/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20";
        File file = new File(dir);
        if (file.isDirectory()){
            String[] list = file.list();
            for (int i = 0; i < list.length; i++){
                File file1 = new File(dir + "/" + list[i]);
                if (file1.isDirectory())
                    System.out.println(file1.getName() + " is directory");
                else
                    System.out.println(file1.getName() + " is file");
            }
        }
        else
            System.out.println("file is not directory");
    }
}
