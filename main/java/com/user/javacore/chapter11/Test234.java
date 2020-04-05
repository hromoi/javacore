import java.util.Scanner;

public class Test234 implements tax{
    public double tax(double summ){
        double tax = 0;
        double temp;

        if (summ <= Double.MAX_VALUE && summ > 50000) {
            temp = summ - 50000;
            tax += (temp / 100) * 30;
            summ -= temp;
        }
        if (summ <= 50000 && summ > 25000){
            temp = summ - 25000;
            tax += (temp / 100) * 25;
            summ -= temp;
        }
        if (summ <= 25000 && summ > 10000){
            temp = summ - 10000;
            tax += (temp / 100) * 20;
            summ -= temp;
        }
        if (summ <= 10000 && summ > 0){
            temp = summ - 0;
            tax += (summ / 100) * 12;
            summ -= temp;
        }
        return tax;
    }

    public static void main(String[] args) {
        Test234 tax = new Test234();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println(tax.tax(sc.nextDouble()));
        } catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
//    от 0 до 10к   12%
//    от 10к до 25к 20%
//    от 25к до 50к 25%
//    50к и выше    30%
}
