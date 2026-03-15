class RunDemo implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++)
            System.out.println("Runnable "+i);
    }
}

public class RunnableThreadExample{
    public static void main(String[] args){
        Thread t=new Thread(new RunDemo());
        t.start();
    }
}