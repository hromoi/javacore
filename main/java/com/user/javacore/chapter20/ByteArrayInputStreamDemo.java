import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test.txt")){
            byte[] arr =  new byte[fileInputStream.available()];
            fileInputStream.read(arr);
            System.out.println(new String(arr, 0 , 4));
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);
            byte[] arr2 = byteArrayInputStream.readAllBytes();
            byteArrayInputStream.reset();
            byte[] arr3 = byteArrayInputStream.readAllBytes();
            for (byte k: arr3
                 ) {
                System.out.print(((char) k));
            }
        } catch (IOException e){
            System.out.println("error i/o " + e);
        }
    }
}
