public class LambdaDemo3 {
    public static void main(String[] args){
        NumericTest2 numericTest2 = (int n, int d) -> n % d == 0;

        System.out.println(numericTest2.test(10, 2));
    }
}
