public class SuspendResume {
    public static void main(String[] args) {
        NewThread4 ob1 = new NewThread4("one");
        NewThread4 ob2 = new NewThread4("two");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("pause first thread");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("continue first thread");
            ob2.mysuspend();
            System.out.println("pause two thread");
            ob2.myresume();
            System.out.println("continue two thread");
        } catch (InterruptedException e){
            System.out.println("main thread break");
        }

        try {
            System.out.println("wait finish all thread");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e){
            System.out.println("main thread break");
        }
        System.out.println("main thread finish");
    }
}
