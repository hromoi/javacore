public class NewThread2Main {
    public static void main(String[] args) {
        NewThread2 ob1 = new NewThread2("NewThread1");
        NewThread2 ob2 = new NewThread2("NewThread2");
        NewThread2 ob3 = new NewThread2("NewThread3");

        System.out.println("Первый поток жив? " + ob1.t.isAlive());
        System.out.println("Второй поток жив? " + ob2.t.isAlive());
        System.out.println("Третий поток жив? " + ob2.t.isAlive());

        System.out.println("Ожидание завершения потоков");
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Первый поток жив? " + ob1.t.isAlive());
        System.out.println("Второй поток жив? " + ob2.t.isAlive());
        System.out.println("Третий поток жив? " + ob2.t.isAlive());
        System.out.println("Основной поток завершился");
    }
}
