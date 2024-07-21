class abc{
    public void show(){
        System.out.println("Show method in A class ");
    }

}
class xyz extends abc{
   // public void show(){
       // System.out.println("Show method in B class ");
    //}

}

class pqr extends abc{
    public void show(){
        System.out.println("Show method in C class ");
    }

}
public class Runtime_Polymorphism {
    public static void main(String[] args) {
        abc a=new abc();
        a.show();
        a=new xyz();
        a.show();
        a=new pqr();
        a.show();
    }
    
}
