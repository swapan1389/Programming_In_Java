class ThreadC extends Thread{
    public void run(){
        for(int i=0;i<4;i++){
            System.out.println("In ThreadC");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

class ThreadD extends Thread{
    public void run(){
        for(int i=0;i<4;i++){
            System.out.println("In ThreadD");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

public class ThreadPriority_Sleep {
    public static void main(String[] args) {
        ThreadC t1=new ThreadC();
        ThreadD t2=new ThreadD();
        System.out.println(t1.getPriority());
        //t1.setPriority(10);
        t1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {e.printStackTrace();}
        t2.start();
        
    }
    
}
