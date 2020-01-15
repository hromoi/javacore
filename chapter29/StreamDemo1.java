package main.java.com.user.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(23);
        myList.add(10);
        myList.add(2);

        final Optional<Integer> reduce = myList.stream().reduce((Integer a, Integer b) -> (a * b));

        if (reduce.isPresent()){
            System.out.println("Произведение в виде объекта типа optional " + reduce.get());
        }

        final Integer reduce1 = myList.stream().reduce(1, (a, b) -> a * b);

        if (reduce.isPresent()){
            System.out.println("Произведение в виде значения типа int " + reduce1);
        }
    }
}
