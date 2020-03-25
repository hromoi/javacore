import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirTreeList {
    public static void main(String[] args) {
        String dirname = "/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/";
        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException e){
            System.out.println("error i/o " + e);
        }
    }
}
