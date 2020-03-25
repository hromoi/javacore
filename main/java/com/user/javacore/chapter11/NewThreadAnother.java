public class NewThreadAnother implements Runnable {
    String name;
    Thread t;

    public NewThreadAnother(String nameThread){
        this.name = nameThread;
        t = new Thread(this, nameThread);
        t.start();
    }

    public void run(){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Дочерний поток " + name + " прерван");
        }
    }
}
