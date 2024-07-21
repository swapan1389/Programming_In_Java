public class DataTypes{
    public static void main(String[] args) {
        float num=2.5f;//we can not write 2.5 only because by default it takes double for decimal values and we can not convert double to float.
        double num1=2.5;
        float num2=2.55555555555555f; // it will print 2.5555556 because it will accepts decimal digits up to 7 
        double num3=2.5555555555555555;  //double will accept till 15 
        System.out.println(num2+" "+num3);
        System.out.println(num+" "+num1);
        
    }
}