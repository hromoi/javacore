public class CurrentThreadDemo{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Текущий поток исполнения " + t);

        t.setName("Переименовал имя главного потока");

        System.out.println("Имя текущего потока после переименования " + t);
        try {
            for (int n = 5; n > 0; n--){
                System.out.println(n);
                t.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Главный поток исполнения прерван");
        }
    }
}