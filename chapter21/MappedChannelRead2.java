package main.java.com.user.javacore.chapter21;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedChannelRead2 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileChannel channel = null;
        MappedByteBuffer mBuff;
        long size;
        try {
            fin = new FileInputStream("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter21/test.txt");
            channel = fin.getChannel();
            size = channel.size();
            mBuff = channel.map(FileChannel.MapMode.READ_ONLY, 0, size);
            Character sym = null;
            do{
                if (size > 0)
                    System.out.println((char) mBuff.get());
            } while (size-- > 0);
        } catch (IOException e){
            System.out.println("error i/o " + e);
        }
    }
}
