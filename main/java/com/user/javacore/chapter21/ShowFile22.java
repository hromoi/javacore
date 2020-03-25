import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class ShowFile22 {
    public static void main(String[] args) {
        int count;
        String s = null;
        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter21/test.txt"))){
            do{
                s = bufferedReader.readLine();
                if (s != null)
                    System.out.println(s);
            } while (s != null);
        } catch (InvalidPathException e){
            System.out.println("path error " + e);
        } catch (IOException e2){
            System.out.println("i/o exception");
        }
    }
}
