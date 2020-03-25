public class InstanceMethWithObjectRefDemo {
    public static <T> int counter(T[] vals, MyFunc<T> f, T v){
        int count = 0;
        for (int i = 0; i < vals.length; i++){
            if (f.func(vals[i], v)) count++;
        }
        return count;
    }

    public static void main(String[] args){
        int count;

        HighTemp[] weekDayHighs = {new HighTemp(23), new HighTemp(12), new HighTemp(9), new HighTemp(10)};
        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(12));
        System.out.println(count);
    }
}
