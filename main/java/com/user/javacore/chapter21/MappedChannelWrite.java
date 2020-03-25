import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelWrite {
    public static void main(String[] args) {
        String str = "dlksfjdskjfkdlsjfldsjfkldsjf     ";
        byte[] arr = str.getBytes();
        try (FileChannel channel = (FileChannel)Files.newByteChannel(Paths.get("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test.txt"), StandardOpenOption.APPEND)){
            ByteBuffer buff = ByteBuffer.allocate(arr.length);
            buff.put(arr);
            buff.rewind();
            channel.write(buff);
//            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 100);
//            buffer.put(arr);
        } catch (InvalidPathException e){
            System.out.println("error path " + e);
        } catch (IOException e2){
            System.out.println("error i/o " + e2);
        }
    }
}
