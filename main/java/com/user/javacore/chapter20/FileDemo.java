import java.io.File;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {
    public static void p(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        File file = new File("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test.txt");
        File file2 = new File("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test2.txt");
        p("Name: " + file.getName());
        p("Path: " + file.getPath());
        p("Absolute path: " + file.getAbsolutePath());
        p("Parent catalog: " + file.getParent());
        p(file.exists() ? "yes" : "no");
        p(file.canWrite() ? "write" : "not write");
        p(file.canRead() ? "read" : "not read");
        p(file.isDirectory() ? "directory" : "not directory");
        p(file.isFile()? "file" : "not file");
        p("last modified: " + file.lastModified());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.mm.yyyy HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date(file.lastModified())));
        p(file.length() + " length file");
        p("file absolute path true or false? " + file.isAbsolute());
        p(file2.renameTo(file) ? "true" : "false");
        p(file.setReadOnly() + " only read file");
        p(file.setWritable(true) + " only write file");
        p(Integer.toString(file.compareTo(file2)));
        Path path = file.toPath();
    }
}
