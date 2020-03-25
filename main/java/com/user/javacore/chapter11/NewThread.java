public class NewThread implements Runnable{
    Thread t;

    public NewThread(){
        t = new Thread(this, "Новый поток");
        System.out.println(t);
        t.start();
    }

    public void run(){
        try {
            for (int i = 5; i > 0; i--){
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Дочерний поток прерван");
        }
    }
}
