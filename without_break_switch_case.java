class without_break_switch_case{
    public static void main(String[] args) {
        String day="Monday";
        switch(day){
            case "sunday","saturday"->System.out.println("wake up at 8 AM");
            case "Monday"->System.out.println("Wake up at 6 AM");
            default ->System.out.println("wake up at 7 AM");
        }
    }
}