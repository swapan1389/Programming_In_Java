class student1{
    String name;
    int id;
    static String course;
    static{
        System.out.println("Static block initialized");
        course="CSE";
    }
    public student1(){
        name="Swapan";
        id=1009;
    }
    public  void display1(){
        System.out.println(name+":"+id+":"+course);
    }
}


public class static_block {
    public static void main(String[] args) {
        student1 obj=new student1();
        // obj.name="Rahul";
        // obj.id=1001;
        student1.course="ME";
        obj.display1();
    }
    
}
