import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Usage: ShowFile name_file");
            return ;
        }
        FileInputStream fileInputStream;

        String str;
        FileReader fileReader;
        File file;
        try {
            fileInputStream = new FileInputStream(args[0]);

        } catch (FileNotFoundException e){
            System.out.println("not possible open file");
            return ;
        }

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));// внутри может быть любой файловый дескриптор, в том числе System.in
            file = new File("/Users/user/Desktop/test.txt");
            fileReader = new FileReader(file);
            int i;
            do {
                i = fileInputStream.read();
                System.out.println((char)i);
            } while (i != -1);
//            System.out.println(bufferedReader.read());
//            System.out.println(fileReader.read());
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            do {
                str = bufferedReader.readLine();
                if (str != null) System.out.println(str);
            } while (str != null);
        } catch (IOException e1){
            System.out.println("error read file");
        }

        try {
            fileInputStream.close();
        } catch (IOException e2){
            System.out.println("error read file");
        }
    }
}
