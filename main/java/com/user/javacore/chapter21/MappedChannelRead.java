import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class MappedChannelRead {
    public static void main(String[] args) {
        try(FileChannel channel = (FileChannel)Files.newByteChannel(Paths.get("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test.txt"))){
            long size = channel.size();
            MappedByteBuffer mbuf = channel.map(FileChannel.MapMode.READ_ONLY,0, size);
            for(int i = 0; i < size; i++)
                System.out.print(((char) mbuf.get()));
        } catch (InvalidPathException e){
            System.out.println("error path " + e);
        } catch (IOException e2){
            System.out.println("error i/o " + e2);
        }
    }
}
