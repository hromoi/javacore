import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        String str = "hello how are you?";
        char[] arr = str.toCharArray();
        CharArrayReader charArrayReader = new CharArrayReader(arr);
        try (BufferedReader bufferedReader = new BufferedReader(charArrayReader)){
            int c;
            while ((c = bufferedReader.read()) != -1){
                System.out.print(((char) c));
            }
        } catch (IOException e){
            System.out.println("error i/o " + e);
        }
    }
}
