public class Main3 {
    public static void main(String[] args){
        Callme callme = new Callme();

        NewThread3 thread3 = new NewThread3(callme, "Hello first thread");
        NewThread3 thread31 = new NewThread3(callme, "Hello second thread");
        NewThread3 thread32 = new NewThread3(callme, "Hello third thread");

        try {
            thread3.t.join();
            thread31.t.join();
            thread32.t.join();
        } catch (InterruptedException e){
            System.out.println("Main thread break");
        }
    }
}
