package main.java.com.user.javacore.chapter15;

public class LambdaAsArgumentDemo {
    public static String stringOp(StringFunc fn, String inStr){
        return fn.func(inStr);
    }

    public static void main(String[] args) {
        String inStr = "Hello. How are you?";
        String outStr;

        outStr = stringOp((String str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--){
                result += str.charAt(i);
            }
            return result;
        }, inStr);
        System.out.println(outStr);
    };
}
