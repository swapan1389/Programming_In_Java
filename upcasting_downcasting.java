class x{
    public void show1(){
        System.out.println("In X Show...");
    }
}
class y extends x{
    public void show2(){
        System.out.println("In Y Show...");
    }

}
public class upcasting_downcasting{
    public static void main(String[] args) {

        //Upcasting.................
        x obj=new y();
        obj.show1();

        //Downcasting...............
        y obj1=(y)obj;
        obj1.show2();
        obj1.show1();
        
    }
}