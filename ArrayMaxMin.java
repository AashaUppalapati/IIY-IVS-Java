public class ArrayMaxMin {
    public static void main(String[] args) {
        int arr[]={5,8,2,9,1};

        int max=arr[0],min=arr[0];

        for(int i:arr){
            if(i>max) max=i;
            if(i<min) min=i;
        }

        System.out.println("Max="+max);
        System.out.println("Min="+min);
    }
}