import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];
        System.out.println("Введите строки для завершения.");
        System.out.println("Нажмите \"стоп\" для завершения");
        for (int i = 0; i < 100; i++){
            str[i] = bufferedReader.readLine();
            if (str[i].equals("стоп")) break;
        }
        System.out.println("Вывести содержимое вашего файла");
        for (int i = 0; i < 100; i++){
            if (str[i].equals("стоп")) break;
            System.out.println(str[i]);
        }
    }
}
