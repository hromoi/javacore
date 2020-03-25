import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois {
    public static void main(String[] args) {
        int c;
        try {
            Socket s = new Socket("whois.internic.net", 43);
            InputStream io = s.getInputStream();
            OutputStream ou = s.getOutputStream();

            String str = args.length == 0 ? "MHProfessional.com" : args[0];
            byte[] arr = str.getBytes();

            ou.write(arr);

            while ((c = io.read()) != -1){
                System.out.println(((char) c));
            }
            s.close();
        } catch (IOException e){
            System.out.println("error i/o " + e);
        }

    }
}
