public class throw_Keyword_Example {
    public static void main(String[] args) {
        //System.out.println("Enter the value of divisor");
       // Scanner scanner=new Scanner(System.in);
       // int i=scanner.nextInt();
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0){
                throw new ArithmeticException("Division value zero not needed");
            }
        }
        catch(ArithmeticException e){
            j=18/1;
            System.out.println("ArithmeticException Handled"+e);
        }
        catch(Exception e){
            System.out.println("Exception Handled");
        }
        System.out.println(j);
        System.out.println("It's done");

    }
    
}
