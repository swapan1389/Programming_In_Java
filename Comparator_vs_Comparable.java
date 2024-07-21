import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// class Students{
//     int age;
//     String name;
//     public Students(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     public String toString() {
//         return "Students [age=" + age + ", name=" + name + "]";
//     }
    
// }




class Students implements Comparable<Students>
{
    int age;
    String name;
    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Students that) {
        if(this.age>that.age){
            return 1;
        }
        else return -1;


    }
    
}

public class Comparator_vs_Comparable{
    public static void main(String[] args) {

        Comparator <Students> com=(Students i,Students j)->{
                if(i.age>j.age){
                    return 1;
                }
                else return -1;
            
        };
        // Comparator <Integer> com=new Comparator<Integer>() {
        //     public int compare(Integer i,Integer j){
        //         if(i%10>j%10){
        //             return 1;
        //         }
        //         else return -1;
        //     }
            
        // };
        //ArrayList<Integer> nums=new ArrayList<>();
        // nums.add(31);
        // nums.add(24);
        // nums.add(52);
        // nums.add(52);
        ArrayList<Students> studs=new ArrayList<>();
        studs.add(new Students(15, "Ram"));
        studs.add(new Students(20, "Sham"));
        studs.add(new Students(25, "Parul"));
        studs.add(new Students(22, "Prantik"));
        Collections.sort(studs,com);
        //Collections.sort(studs);
        //System.out.println(studs);
        for(Students s:studs){
            System.out.println(s);
        }
        
    }
}