class x{
    int x=5;
    public void show(){
        System.out.println("x="+x);
    }
    class y{
        int x=10;
        public void show1(){
            System.out.println("x="+x);
        }

    }
}

public class InnerClass {
    public static void main(String[] args) {
        x obj=new x();
        obj.show();
        x.y obj1=obj.new y();
        obj1.show1();
    }
    
    
}
