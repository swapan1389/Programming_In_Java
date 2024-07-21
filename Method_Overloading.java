class Calculator{
    public int add(int num1,int num2){
        return (num1+num2);
    }
    public float add1(float num1,float num2){
        return (num1+num2);
    }

}

public class Method_Overloading {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        int result1=obj.add(5, 7);
        System.out.println(result1);
        float result2=obj.add1(2.5f,1.5f);
        System.out.println(result2);
        
    }
    
}
