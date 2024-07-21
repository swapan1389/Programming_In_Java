interface Printable{
    void print();

}

interface Showable{
    void show();
}

class G implements Printable,Showable{
    public void print(){
        System.out.println("Printing......");
    }
    public void show(){
        System.out.println("Showing......");
    }
}

public class MultipleInheritence {
    public static void main(String[] args) {
        G g=new G();
        g.print();;
        g.show();
        
    }
    
}
