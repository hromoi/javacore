import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(1.0);
        myList.add(2.0);
        myList.add(3.0);
        myList.add(4.0);
        myList.add(5.0);

        final Stream<Double> doubleStream = myList.stream().map((Double a) -> Math.sqrt(a));

        Double number = doubleStream.reduce(1.0, (a, b) -> a * b);

        System.out.println("Произведение квадратных корней " + number);

        final Double reduce = myList.stream().reduce(1.0, (Double a, Double b) -> {
            System.out.print(a + " ");
            return (a * b);});
    }
}
