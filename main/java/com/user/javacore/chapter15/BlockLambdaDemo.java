public class BlockLambdaDemo {
    public static void main (String[] args){
        NumericFunc numericFunc = (int n) -> {
            int result = 1;
            for (int i = 1; n >= i; i++){
                result *= i;
            }
            return result;
        };
        System.out.println(numericFunc.factorial(10));
        System.out.println(numericFunc.factorial(2));
        System.out.println(numericFunc.factorial(3));
        System.out.println(numericFunc.factorial(4));
    }
}
