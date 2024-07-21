

class C{
    public void show(){
        System.out.println("Show method in class C");
    }
}
public class anonymous_class {
    public static void main(String[] args) {
        C c=new C(){
            public void show(){
                System.out.println("Anonymous class method...............");
            }

        };
        c.show();
        
    }
    
}
