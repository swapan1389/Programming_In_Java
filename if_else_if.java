public class if_else_if {
    public static void main(String[] args) {
        int x=8;
        int y=7;
        int z=9;
        if(x>y && x>z){
            System.out.println("The highest number among three is"+" "+x);
        }
        else if(y>x && y>z){
            System.out.println("The highest number among three is"+" "+y);
        }
        else{
            System.out.println("The highest number among three is"+" "+z);
        }
    }
}
