abstract class D{
    abstract public void run();
}

public class abstract_anonymous_class {
    public static void main(String[] args) {
        D d=new D() {
            public void run(){
                System.out.println("It's running...............");
            }
        };
        d.run();
        
    }
    
}

