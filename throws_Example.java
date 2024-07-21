class K{
    public void show() throws ClassNotFoundException{
        Class.forName("throws_Example");
    }
}


public class throws_Example{
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
        K obj=new K();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        
    }
}