public class while_loop {
    public static void main(String[] args) {
        int i=0;
        while (i<4) {
            System.out.println("welcome to..."+" "+i);
            int j=1;
            while(j<=3){
                System.out.println("Hello"+" "+j);
                j++;
            }
            i++;
            
        }
        System.out.println("Welcome to"+" "+i);     //Welcome to 4
    }
    
}
