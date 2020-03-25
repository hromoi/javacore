public class NewThread3 implements Runnable {
    Thread t;
    Callme callme;
    String msg;

    public NewThread3(Callme callme, String msg){
        this.callme = callme;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (callme) {
            callme.call(msg);
        }
    }
}
