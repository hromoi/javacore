package main.java.com.user.javacore.chapter29;


import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Исходный список: " + myList);

        Stream<Integer> myStream = myList.stream();
        final Optional<Integer> min = myStream.min(Integer::compareTo);

        if (min.isPresent()){
            System.out.println("Минимальное число: " + min.get());
        }

        final Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.print("Отсортированный поток данных: ");
        sortedStream.forEach((Integer n) -> System.out.print(n + " "));
        System.out.println();

        final Stream<Integer> integerStream = myList.stream().sorted().filter((n) -> (n % 2) == 1);

        System.out.print("Нечетные значения ");
        integerStream.forEach((Integer n) -> System.out.print(n + " "));
        System.out.println();

        System.out.print("Нечетные значения больше 5 ");
        final Stream<Integer> integerStream1 = myList.stream().sorted().filter((Integer n) -> n % 2 == 1).filter((Integer n) -> n > 5);
        integerStream1.forEach((Integer n) -> System.out.print(n + " "));

    }
}
