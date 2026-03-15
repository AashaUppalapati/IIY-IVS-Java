public class MostFrequentChar {
    public static void main(String[] args) {
        String str="programming";
        int[] freq=new int[256];

        for(char c:str.toCharArray())
            freq[c]++;

        int max=0;
        char ch=' ';

        for(int i=0;i<256;i++){
            if(freq[i]>max){
                max=freq[i];
                ch=(char)i;
            }
        }

        System.out.println("Most frequent char="+ch);
    }
}