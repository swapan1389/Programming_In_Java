enum Status{
    Running,Failed,Pending,Success;
}


public class enumExample{
    public static void main(String[] args) {
        Status[] ss=Status.values();
        for (Status s : ss) {
            System.out.println(s+" :"+s.ordinal());
            
        }
        
    }
}