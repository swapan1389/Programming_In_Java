public class return_switch_case {
    public static void main(String[] args) {
        String day="Monday";
        String result="";
        result=switch(day){
            case "sunday","saturday"->"wake up at 8 AM";
            case "Monday"->"Wake up at 6 AM";
            default ->"wake up at 7 AM";
        };
        System.out.println(result);
    }
    
}
