import java.util.ArrayList;
//import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(4);
        nums.add(3);
        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.get(3));
        nums.remove(3);
        System.out.println(nums);
        nums.clear();
        System.out.println(nums);

        
    }
    
}
