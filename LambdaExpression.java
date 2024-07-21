@FunctionalInterface
interface I{
    void drive(int speed);
    //void stop();
}

public class LambdaExpression {
    public static void main(String[] args) {
        I i=(speed)->System.out.println("Speed is"+" "+speed+"km/h");
        i.drive(50);
        
    }
    
}
