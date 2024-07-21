import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;

public class for_each_Example{
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(5,8,9,6,7,2);
        // Consumer<Integer> con=new Consumer<Integer>() {
        //     public void accept(Integer n) {
        //         System.out.println(n);
        //     }
        // };

        // Consumer<Integer> con=(Integer n)->System.out.println(n);
        //  nums.forEach(con);

        nums.forEach(n->System.out.println(n));
    }
}