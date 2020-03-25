import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStream;

public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20";
        File file = new File(dirname);
        FilenameFilter filter = new OnlyExt("java");
        String[] array = file.list(filter);
        for (String arr : array) {
            System.out.println(arr);
        }
    }
}
