class A11{
    private int a=6;
    public void show(){
        System.out.println(a);
    }
}

public class A1{
    public static void main(String[] args) {
        A11 a1=new A11();
        // int r1=a1.a; //private is accessible only in same class gives error
        a1.show();
        
    }
}