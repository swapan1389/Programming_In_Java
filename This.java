class employee{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;

    }
    
}
public class This {
    public static void main(String[] args) {
        employee obj=new employee();
        obj.setAge(20);
        obj.setName("Swapan");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        
    }
    
}
