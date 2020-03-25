import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<>();

        files.add("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test.txt");
        files.add("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test2.txt");
        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(ise);
        try {
            while ((c = input.read()) != -1){
                System.out.print(((char) c));
            }
        } catch (IOException e){
            System.out.println("error i/o " + e);
        } finally {
            try {
                input.close();
            } catch (IOException e2){
                System.out.println("error i/o " + e2);
            }
        }
    }
}
