public class MyStringOps {
    public static String reverseStr(String inStr){
        String outStr = "";
        for (int i = inStr.length() - 1; i >= 0; i--){
            outStr += inStr.charAt(i);
        }
        return outStr;
    }
}
