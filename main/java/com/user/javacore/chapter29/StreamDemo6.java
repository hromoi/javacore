import java.util.ArrayList;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(1.0);
        myList.add(9.4);
        myList.add(8.3);
        myList.add(4.3);


        System.out.println("Исходный поток");
        myList.stream().forEach((Double n) -> System.out.print(n + " "));

        final DoubleStream intStream = myList.stream().mapToDouble((Double n) -> (Math.ceil(n)));

        System.out.println("Поток округленных чисел в большую сторону");

        intStream.forEach((double n) -> System.out.print(n + " "));
    }
}
