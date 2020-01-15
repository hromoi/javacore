package main.java.com.user.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("larry", "larry@gmail.com", "11111"));
        myList.add(new NamePhoneEmail("john", "john@gmail.com", "22222"));
        myList.add(new NamePhoneEmail("klark", "klark@gmail.com", "33333"));

        System.out.println("Исходные элементы из списка myList");

        myList.stream().forEach((NamePhoneEmail a) -> System.out.println(a.getPhone() + " " + a.getName() + " " + a.getMail()));

        Stream<NamePhone> myStream = myList.stream().map((NamePhoneEmail a) -> new NamePhone(a.getName(), a.getPhone()));
        System.out.println();

        System.out.println("Обновленные элементы списка myList");

        myStream.forEach((a) -> System.out.println(a.getName() + " " + a.getPhone()));
    }
}
