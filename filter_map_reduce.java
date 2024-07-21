import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class filter_map_reduce{
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(4,5,7,3,2,6);

        Predicate<Integer> p=new Predicate<Integer>() {
            public boolean test(Integer n) {
                if (n%2==0) {
                    return true;
                    
                }
                else
                return false;
            }
            
        };
        Function<Integer,Integer> fun=new Function<Integer,Integer>() {

            @Override
            public Integer apply(Integer n) {
                return n*2;
            }
            
        };


        int result=nums.stream()
        .filter(p)
        .map(fun)
        .reduce(0,(c,e)->c+e);
        System.out.println(result);
    }
}