public class paramterisedconstructor {
    int id;
    String name;
    public paramterisedconstructor(){
        id=1202;
        name="sachin";

    }
    public paramterisedconstructor(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        paramterisedconstructor obj1=new paramterisedconstructor();
        paramterisedconstructor obj2=new paramterisedconstructor(1200, "Ram");
        obj1.display();
        obj2.display();
    }

    
}
