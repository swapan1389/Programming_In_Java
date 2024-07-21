abstract class Car{
    abstract public void drive();
    public void playMusic(){
        System.out.println("Playing Music");
    }
}
class WagonR extends Car{              //Concrete Class
    public void drive(){
        System.out.println("Driving..............");
    }
}
public class abstract_class {
    public static void main(String[] args) {
        Car obj=new WagonR();
        obj.drive();
        obj.playMusic();
        
    }
    
}
