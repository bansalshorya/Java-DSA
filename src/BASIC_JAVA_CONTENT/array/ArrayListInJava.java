package BASIC_JAVA_CONTENT.array;
import java.util.ArrayList;
public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(12);
        arr.add(22);
        arr.add(32);
        arr.add(42);
        arr.add(52);
        System.out.println(arr.get(3));
        System.out.println(arr);
        arr.set(3,50);
        System.out.println(arr.get(3));
        System.out.println(arr);
    }
}
