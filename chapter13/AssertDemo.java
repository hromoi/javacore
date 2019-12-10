package main.java.com.user.javacore.chapter13;

public class AssertDemo {
    static int val = 3;

    static int getNum(){
        return val--;
    }

    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++){
            n = getNum();
            System.out.println(n);
            assert n > 0 : "Проверку не прошло, потому метод вернуд отрицательное число!";
            System.out.println("Все нормально метод вернул положительный результат");
        }
    }
}
