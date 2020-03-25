package instanceOf;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        A ob = c;

        if (a instanceof A)
            System.out.println("объект а принадлежит классу А");
        if (b instanceof B)
            System.out.println("объект b принадлежит классу B");
        if (c instanceof C)
            System.out.println("объект c принадлежит классу С");
        if (d instanceof D)
            System.out.println("объект d принадлежит классу D");
        if (c instanceof A)
            System.out.println("объект с можно привести к типу А");
        if (d instanceof C)
            System.out.println("объект d можно привести к типу С");
        if (d instanceof A)
            System.out.println("объект d можно привести к типу А");
        if (ob instanceof D)
            System.out.println("yes");
        else
            System.out.println("no");

    }
}
