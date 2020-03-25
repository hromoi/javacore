import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList2 {
    public static void main(String[] args) {
        try (DirectoryStream<Path> paths = Files.newDirectoryStream(Paths.get("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter21"), "*.{java}")){
            for (Path path:paths
                 ) {
                final BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

                if (basicFileAttributes.isDirectory())
                    System.out.print("DIR ");
                else
                    System.out.print("not DIR ");
                System.out.println(path.getName(11));
            }
        } catch (InvalidPathException e){
            System.out.println("error path " + e);
        } catch (IOException e2){
            System.out.println("error directory " + e2);
        }
    }
}
