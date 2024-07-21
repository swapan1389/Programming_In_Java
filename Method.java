class Computer{
    public void PlayMusic(){
        System.out.println("Playing Music");

    }
    public void BrowseInternet(){
        System.out.println("You have browsed the internet");
    }
    public String getMeAPen(int price){
        if(price>=10){
            return "Pen";
        }
        else{
            return "Nothing";
        }

    }
}


public class Method {
    public static void main(String[] args) {
        Computer obj=new Computer();
        obj.PlayMusic();
        obj.BrowseInternet();
        String result=obj.getMeAPen(40);
        System.out.println(result);
        
    }
    
}
