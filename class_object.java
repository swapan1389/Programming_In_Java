class Calculator{
    public void add(int a,int b){
        int result=(a+b);
        System.out.println("The addition is "+result);
    }
}

public class class_object {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        // int add=cal.add(10, 20);
        cal.add(10, 20);
        // System.out.println("The addition is "+" :"+add);
        
    }
    
}
