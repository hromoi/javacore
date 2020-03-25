import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UseMethodRef {
    public static int compareMc(MyClass a, MyClass b){
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        List<MyClass> al = new ArrayList<MyClass>();
        al.add(new MyClass(1));
        al.add(new MyClass(2));
        al.add(new MyClass(4));
        al.add(new MyClass(14));
        al.add(new MyClass(7));

        MyClass maxMyClass = Collections.max(al, UseMethodRef::compareMc);
        System.out.println(maxMyClass.getVal());
    }
}
