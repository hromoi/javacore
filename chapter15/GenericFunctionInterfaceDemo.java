package main.java.com.user.javacore.chapter15;

public class GenericFunctionInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> func = (String str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--){
                result += str.charAt(i);
            }
            return result;
        };
        SomeFunc<Integer> factorial = (Integer n) -> {
            int result = 1;
            for (int i = 1; n >= i; i++){
                result *= i;
            }
            return result;
        };
        System.out.println(factorial.func(3));
        System.out.println(func.func("Hello"));
    }
}
