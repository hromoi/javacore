import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile2 {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter13/test.txt"); FileOutputStream fileOutputStream = new FileOutputStream("/Users/user/Desktop/test.txt")){
            int read;
            do {
                read = fileInputStream.read();
                if (read != -1) fileOutputStream.write(read);
            } while (read != -1);
        } catch(IOException o){
            System.out.println("Error IOException");
        }
    }
}
