public class try_multiple_catch {
    public static void main(String[] args) {
        int i=2;
        int nums[]=new int[5];
        try {
            int j=18/i;
            System.out.println(j);
            System.out.println(nums[1]);
            System.out.println(nums[6]);

        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Value is not available in this index");
        }
    }
    
}
