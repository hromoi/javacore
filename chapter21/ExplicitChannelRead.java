package main.java.com.user.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filepath = null;

        try {
            filepath = Paths.get("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test.txt");
        } catch (InvalidPathException e){
            System.out.println("error path " + e);
        }

        try (SeekableByteChannel channel = Files.newByteChannel(filepath)){
            ByteBuffer buf = ByteBuffer.allocate(128);
            do {
                count = channel.read(buf);
                System.out.println(count);
                if (count != -1){
                    buf.rewind();
                    for(int i = 0; i < count; i++)
                        System.out.print(((char) buf.get()));
                }
            } while (count != -1);
            System.out.println();
        } catch (IOException e2){
            System.out.println("error i/o " + e2);
        }
    }
}
