public class NewThread2 implements Runnable{
    Thread t;
    String name;

    public NewThread2(String nameThread){
        this.name = nameThread;
        t = new Thread(this, name);
        t.start();
    }

    public void run(){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершился");
    }
}
