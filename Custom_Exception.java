class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}

public class Custom_Exception {
    public static void main(String[] args) {
        int x=20;
        int y=0;
        try {
            y=18/x;
            if(y==0){
                throw new MyException("Division value zero not needed");
            }
            
        } catch (MyException e) {
            y=18/1;
            System.out.println("Custom Exception handled"+" "+e);
        }
        System.out.println(y);
        System.out.println("Bye");
    }
    
}
