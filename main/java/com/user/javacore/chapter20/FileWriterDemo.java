import java.io.*;

public class FileWriterDemo {
    public static void main(String[] args) {
        String str = "hello how are you?";
        char[] arr = str.toCharArray();
        byte[] arrbyte = str.getBytes();

        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrbyte)){
            InputStreamReader inputStreamReader = new InputStreamReader(byteArrayInputStream);
            int c;
            while ((c = inputStreamReader.read()) != -1)
                System.out.print(((char) c));
            System.out.println();
        } catch (IOException e){
            System.out.println("error i/o " + e);
        }

        char[] arr2 = new char[str.length()];
        str.getChars(0, str.length(), arr2, 0);
        char[] arr3 = new char[40];
        try (FileReader fileReader = new FileReader("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test2.txt"); FileWriter fileWriter = new FileWriter("/Users/user/IdeaProjects/javacore/src/main/java/com/user/javacore/chapter20/test.txt"); BufferedReader byfferedReader = new BufferedReader(fileReader)){
            fileWriter.write(str);
            byfferedReader.read(arr3);
        } catch (IOException e){
            System.out.println("error i/o " + e);
        }
        for (char sym:arr3
             ) {
            System.out.print(sym);
        }
    }
}
