import java.util.Arrays;
import java.util.List;

public class Q {
    int n;
    boolean valueSet = false;
    int count = 0;

    synchronized int get(){
        while (!valueSet)
            try {
                System.out.println("wait consumer");
                wait();
            } catch (InterruptedException e){
                System.out.println("Искючение типа InterruptedException перехвачено");
            }
        valueSet = false;
        System.out.println("Получено: " + n);
        count++;
        if (count == 6)
            System.exit(0);
        notify();
        return n;
    }

    synchronized void put(int n){
        while (valueSet)
            try {
                System.out.println("wait producer");
                wait();
            } catch (InterruptedException e){
                System.out.println("Исключение типа InterruptedException перехвачено");
            }
        this.n = n;
        valueSet = true;
        System.out.println("Отправлено: " + n);
        notify();
    }
}
