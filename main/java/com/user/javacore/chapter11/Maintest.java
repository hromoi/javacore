import java.util.*;

public class Maintest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[][] arr = new int[count][2];
        String[] str;
        for (int i = 0; i < count; i++){
            str = sc.next().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }
        for (int i = 0; i < count; i++){
            for (int j = 0; j < count; j++) {
                if (arr[i][0] >= arr[j][0] && j != i){

                }
            }
        }
    }
}
