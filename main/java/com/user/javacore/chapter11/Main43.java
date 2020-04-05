
import java.util.*;
import java.lang.*;

    class Main43{

        public static int strcmp(String strPattern, String str){
            for(int i = 0; i < strPattern.length(); i++){
                int i1 = strPattern.charAt(i);
                int i2 = str.charAt(i);
                if (i1 - i2 != 0){
                    return Math.abs(i1 - i2);
                }
            }
            return 0;
        }

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            String allWord = sc.next();
            long countWord = sc.nextInt();

            ArrayList<String> listWords = new ArrayList<>();
            for (long i = 0; i < countWord; i++){
                listWords.add(sc.next());
            }

            List<String> allPatternWord = Arrays.asList(allWord.split(" "));
            for (String str : listWords){
                for (String strPattern : allPatternWord){
                    if(strPattern.length() == str.length()){
                        if (strPattern.equals(str) || strPattern.length() == 1){
                            System.out.println(strPattern);
                        }
//                        Main.strcmp(strPattern, str);
                    }
                }
            }
        }
    }
