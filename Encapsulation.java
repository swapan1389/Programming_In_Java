class Human{
    private int age=20;
    private String name="Swapan";
    public int  getAge(){
        return age;
    }
    public String getname(){
        return name;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Human obj=new Human();
        // obj.age=20;
        // obj.name="Swapan";
        // System.out.println(obj.name);
        System.out.println("The age of the human is:"+obj.getAge()+" "+"The name of the human is:"+obj.getname());
        
    }
}