class ThreadE implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("In ThreadE");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
    
}

class ThreadF implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("In ThreadF");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
public class Runnable_Thread_Example{
    public static void main(String[] args) {
        // ThreadE obj1=new ThreadE();
        // ThreadF obj2=new ThreadF();
        // Thread t1=new Thread(obj1);
        // Thread t2=new Thread(obj2);
        // t1.start();
        // t2.start();

        Runnable obj1=()->{
                for(int i=0;i<5;i++){
                    System.out.println("In ThreadF");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
        Runnable obj2=()->{
            for(int i=0;i<5;i++){
                System.out.println("In ThreadF");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
            
        
    }
}