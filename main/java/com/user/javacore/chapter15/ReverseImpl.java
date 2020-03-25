public class ReverseImpl {
    public static void main (String[] args){
        Reverse reverse = (String str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--){
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println(reverse.reverseStr("hello"));
    }
}
