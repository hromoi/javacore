import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ExcliptChannelRead {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileChannel channel = null;
        int count = 0;
        try {
            fin = new FileInputStream("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter21/test.txt");
            channel = fin.getChannel();
            ByteBuffer bf = ByteBuffer.allocate(100);
            do {
                count = channel.read(bf);
                if (count != -1){
                    bf.rewind();
                    for (int i = 0; i < count; i++)
                        System.out.print((char) bf.get());
                }
            } while (count != -1);
        } catch (IOException e){
            System.out.println("error i/o " + e);
        } finally {
            try {
                if (channel != null)
                    channel.close();
            } catch (IOException e){
                System.out.println("error i/o " + e);
            }
            try {
                if (fin != null)
                    fin.close();
            } catch (IOException e){
                System.out.println("error i/o " + e);
            }
        }
    }
}
