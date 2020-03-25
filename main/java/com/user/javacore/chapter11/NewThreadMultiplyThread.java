public class NewThreadMultiplyThread {
    public static void main(String[] args) {
        new NewThreadAnother("Первый поток");
        new NewThreadAnother("Второй поток");
        new NewThreadAnother("Третий поток");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток закончил работу");
    }
}
