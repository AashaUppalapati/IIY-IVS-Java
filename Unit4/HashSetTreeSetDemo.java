import java.util.*;

public class HashSetTreeSetDemo{
    public static void main(String[] args){
        HashSet<Integer> h=new HashSet<>();
        h.add(5);
        h.add(2);
        h.add(5);

        TreeSet<Integer> t=new TreeSet<>();
        t.add(8);
        t.add(1);
        t.add(3);

        System.out.println(h);
        System.out.println(t);
    }
}