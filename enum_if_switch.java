enum Status{
    Running,Failed,Pending,Success;
}

public class enum_if_switch {
    public static void main(String[] args) {
        Status s=Status.Pending;

        //use of if
        if(s==Status.Running){
            System.out.println("All good");
        }
        else if(s==Status.Failed){
            System.out.println("try again");
        }
        else if(s==Status.Pending){
            System.out.println("Please Wait");
        }
        else{
            System.out.println("Done");
        }


        //Use of switch
        switch(s){
            case Running:{
                System.out.println("All good");
                break;
            }
            case Failed:{
                System.out.println("try again");
                break;
            }
            case Pending:{
                System.out.println("Please wait");
                break;
            }
            case Success:{
                System.out.println("Done");
                break;
            }
        }
        
    }
    
}
