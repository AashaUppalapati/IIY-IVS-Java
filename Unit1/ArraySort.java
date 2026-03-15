import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int arr[]={5,3,8,1,2};
        Arrays.sort(arr);

        for(int i:arr)
            System.out.print(i+" ");
    }
}