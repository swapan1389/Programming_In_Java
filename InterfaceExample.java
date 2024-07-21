interface E{
    int a=22;
    String name="abc";
    void eating();
    void working();
}

class F implements E{

    public void eating() {
        System.out.println("eating.....");
    }
    public void working() {
        System.out.println("Working...........");
    }
    
}
public class InterfaceExample{
    public static void main(String[] args) {
        E obj=new F();
        obj.eating();
        obj.working();
        System.out.println(E.a);
        System.out.println(E.name);
        
    }
}