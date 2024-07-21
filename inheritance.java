class Animal{
    String name;
    public void display1(){
        System.out.println("This is a animal class");
    }
}
class Dog extends Animal{
    public Dog(){
        name="Dog";
    }
    public void display(){
        System.out.println("This is a class of Dog");
    }
    
}
public class inheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.display();
        d.display1();
    }
    
}
