public class try_catch_Example {
    public static void main(String[] args) {
        int x=0;
        try {
            int y=18/x;
            System.out.println(y);
        } catch (Exception e) {
            System.out.println("Exception caught");

        }
        System.out.println("It's done");
    }
    
}
