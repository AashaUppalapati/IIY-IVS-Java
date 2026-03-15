import java.util.*;

public class HashMapTreeMapDemo{
    public static void main(String[] args){
        HashMap<Integer,String> h=new HashMap<>();
        h.put(1,"Java");
        h.put(2,"Python");

        TreeMap<Integer,String> t=new TreeMap<>();
        t.put(3,"C++");
        t.put(4,"Go");

        System.out.println(h);
        System.out.println(t);
    }
}