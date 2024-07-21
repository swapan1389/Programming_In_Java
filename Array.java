import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int array[]=new int[5];
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<array.length;i++){
            array[i]=SC.nextInt();
        }
        System.out.print("The elements in the array:");
        for(int i=0;i<5;i++){
            System.out.print(array[i]+",");
        }

    }
    
}
