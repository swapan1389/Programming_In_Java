import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample{
    public static void main(String[] args) {
        Set<Integer> nums=new HashSet<Integer>();
        System.out.println(nums.isEmpty());
        nums.add(21);
        nums.add(34);
        nums.add(62);
        nums.add(91);
        nums.add(21);
        //System.out.println(nums);
        Iterator<Integer> values=nums.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
            
        }
    }
}