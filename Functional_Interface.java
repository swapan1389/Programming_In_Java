@FunctionalInterface
interface G{
    void show();

}

// class H implements G{

//     @Override
//     public void show() {
//         System.out.println("In Show....");
//     }
    
// }



public class Functional_Interface{
    public static void main(String[] args) {
        G g=new G(){
            public void show(){
                System.out.println("In show..............");
            }

        };
        g.show();
        
    }
}