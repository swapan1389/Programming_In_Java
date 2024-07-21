import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> students=new HashMap<String,Integer>();
        students.put("A", 56);
        students.put("B", 121);
        students.put("C", 232);
        students.put("D", 54);
        students.put("A",89 );
        System.out.println(students);
        System.out.println(students.keySet());
        for(String key:students.keySet()){
            System.out.println(key+" : "+students.get(key));
        }
    }
    
}
