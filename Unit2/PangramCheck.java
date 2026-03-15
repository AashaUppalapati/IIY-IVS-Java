public class PangramCheck {
    public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy dog".toLowerCase();
        boolean[] arr=new boolean[26];

        for(char c:str.toCharArray()){
            if(c>='a' && c<='z')
                arr[c-'a']=true;
        }

        boolean pangram=true;
        for(boolean b:arr){
            if(!b){
                pangram=false;
                break;
            }
        }

        if(pangram) System.out.println("Pangram");
        else System.out.println("Not Pangram");
    }
}