import java.util.Scanner;

class Multidimensional_Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[][]=new int[3][4];
        System.out.println("Enter the elements in the multidimensional array:");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements are:");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        for(int n[]:nums){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }
}