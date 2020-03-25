public class NewThread4 implements Runnable{
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread4 (String threadname){
        name = threadname;
        t = new Thread(this, name);
        suspendFlag = false;
        t.start();
    }

    public void run(){
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this){
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        } catch (InterruptedException e){
            System.out.println(name + " escape.");
        }
        System.out.println(name + " finish");
    }

    synchronized void mysuspend(){
        suspendFlag = true;
    }

    synchronized void myresume(){
        suspendFlag = false;
        notify();
    }
}
