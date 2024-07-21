public class string_switch_case{
    public static void main(String[] args) {
        String str="Dog";
        switch(str){
            case "Dog":
            System.out.println("The dog is barking...");
            break;
            case "Cat":
            System.out.println("The cat is Meow");
            break;
            default:
            System.out.println("Enter valid animal");
        }
    }
}