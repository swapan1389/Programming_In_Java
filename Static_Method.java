class student{
    String Name;
    int id;
    static String Course;
    public void display(){
        System.out.println(Name+":"+id+":"+Course);
    }
    public static void display1(student obj){
        System.out.println("It is a static method...........");
        System.out.println(obj.Name+":"+obj.id+":"+Course);
}
}

public class Static_Method {
    public static void main(String[] args) {
        student obj1=new student();
        obj1.Name="Ram";
        obj1.id=101;
        student.Course="CSE";
        
        student obj2=new student();
        obj2.Name="Shyam";
        obj2.id=102;
        student.Course="ME";

        obj1.display();
        obj2.display();
        student.display1(obj1);

        
    }
    
}

