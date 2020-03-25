import java.util.ArrayList;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(25.0);
        myList.add(25.0);
        myList.add(25.0);
        myList.add(25.0);
//        myList.add(9.2);
        double reduce = myList.parallelStream().reduce(1.0 , (a, b) ->
        {
            System.out.println(a);
            return a * Math.sqrt(b); }, (a, b) ->{
            System.out.println(a + " " + b);
            return a * b;
        });
        System.out.println("Произведение квадратных корней " + reduce);
    }
}
