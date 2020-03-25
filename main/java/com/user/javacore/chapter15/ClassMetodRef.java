public class ClassMetodRef {
    public static String strReverse(StringFunc fn, String inStr){
        return fn.func(inStr);
    }

    public static void main(String[] args) {
        String inStr = "Hello";
        String outStr;

        outStr = strReverse(MyStringOps :: reverseStr, inStr);
        System.out.println(outStr);
    }
}
