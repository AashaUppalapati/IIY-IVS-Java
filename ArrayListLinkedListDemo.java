import java.util.*;

public class ArrayListLinkedListDemo{
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(20);

        LinkedList<Integer> l=new LinkedList<>();
        l.add(5);
        l.add(15);

        System.out.println(a);
        System.out.println(l);
    }
}