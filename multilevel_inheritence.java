class Person{
    public void display(){
        System.out.println("This is a person class");
    }
}
class graduadestudent extends Person{
    public void graduate(){
        System.out.println("This is a graduate student");
    }

}
class EngineeringStudent extends graduadestudent{
    public void engineering(){
        System.out.println("This is a engineering student");
    }
}
public class multilevel_inheritence{
    public static void main(String[] args) {
        EngineeringStudent es=new EngineeringStudent();
        es.display();
        es.graduate();
        es.engineering();
        
    }
}