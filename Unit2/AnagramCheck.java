import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1="CAT";
        String s2="ACT";

        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}