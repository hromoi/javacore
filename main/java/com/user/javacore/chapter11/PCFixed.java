public class PCFixed {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
//        System.out.println("inicialization producer");
        new Consumer(q);
//        System.out.println("inicialization consumer");
        System.out.println("Для остановки нажмите Ctrl - C");
    }
}
