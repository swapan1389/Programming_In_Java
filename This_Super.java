class A{
    public A(){
        System.out.println("Default constructor in class A");
    }
    public A(int n){
        this();
        System.out.println("Parameterized constructor in class A");
    }


}
class B extends A{
    public B(){
        System.out.println("Default constructor in class B");
    }
    public B(int n){
        super(5);
        System.out.println("Parameterized constructor in class B");
    }

}

public class This_Super {
    public static void main(String[] args) {
        B b=new B(10);
        
    }
    
}
