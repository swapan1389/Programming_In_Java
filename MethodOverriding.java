class Calc{
    public int add(int a,int b){
        return a+b;
    }

}
class AdvCalc extends Calc{
    public int add(int a,int b){
        return a+b+2;
    }

}
public class MethodOverriding{
    public static void main(String[] args) {
        AdvCalc ac=new AdvCalc();
        int r=ac.add(5, 7);
        System.out.println(r);
    }

}