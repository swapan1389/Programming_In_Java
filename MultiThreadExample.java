class ThreadA extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("It is threadA");
        }
    }
}

class ThreadB extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("It is ThreadB");
        }
    }
}

public class MultiThreadExample{
    public static void main(String[] args) {
        ThreadA t1=new ThreadA();
        ThreadB t2=new ThreadB();
        t1.start();
        t2.start();
        
    }

}