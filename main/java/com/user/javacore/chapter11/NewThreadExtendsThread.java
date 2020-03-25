public class NewThreadExtendsThread extends Thread {

    public NewThreadExtendsThread(){
        super("Демонстрационный поток");
        System.out.println("Дочерний поток " + this);
        start();
    }

    public void run (){
        try {
            for (int i = 5; i > 0; i--){
                System.out.println("Дочерний поток " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток превран");
        }
        System.out.println("Дочерний поток завершен");
    }
}
