public class store_result_in_switch {
    public static void main(String[] args) {
        String day="Monday";
        String result ="";
        switch(day){
            case "sunday","saturday"->result="8AM";
            case "Monday"->result="6 AM";
            default ->result="7 AM";
        }
        System.out.println(result);
    }
    
}
