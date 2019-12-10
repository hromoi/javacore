package main.java.com.user.javacore.chapter15;

public class AverageDouble {
    public static void main(String[] args) {
        Double[] array = {1.0, 2.0, 3.0, 4.0};
        AverageInterface average = (Double[] arr) -> {
            double result = 0;
            if (arr.length == 0)
                throw new Exception("Массив пуст");
            for (int i = 0; i < arr.length; i++){
                result += arr[i];
            }
            result /= arr.length;
            return result;
        };
        try{
            System.out.println(average.average(array));
            System.out.println(average.average(new Double[0]));
        } catch (Exception o){
            System.out.println("Массив пуст");
        }
    }
}
