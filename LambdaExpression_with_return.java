@FunctionalInterface
interface J{
    int add(int a,int b);
}

public class LambdaExpression_with_return {
    public static void main(String[] args) {
        J j=(a,b)->a+b;
        int result=j.add(5,6);
        System.out.println("The addition of two numbers is.."+"= "+result);
        
    }
    
}
