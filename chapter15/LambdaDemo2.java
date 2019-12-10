package main.java.com.user.javacore.chapter15;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest numericTest;

        numericTest = (int n) -> n % 2 == 0;

        System.out.println(numericTest.test(3));
        System.out.println(numericTest.test(10));

        NumericTest isNonNeg;

        isNonNeg = (int n) -> n >= 0;

        System.out.println(isNonNeg.test(-1));
        System.out.println(isNonNeg.test(1));
    }
}
