package main.java.com.user.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExcliptChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test.txt"), StandardOpenOption.WRITE, StandardOpenOption.CREATE)){
            ByteBuffer buff = ByteBuffer.allocate(26);
            String str = "hello hello hello hello";
            byte[] arr = str.getBytes();
            buff.put(arr);
            buff.rewind();
            fileChannel.write(buff);
        } catch (InvalidPathException e){
            System.out.println("error path " + e);
        } catch (IOException e2){
            System.out.println("error i/o " + e2);
        }
    }
}
