public class for_each_loop {
    public static void main(String[] args) {
        int nums[]=new int[4];
        nums[0]=4;
        nums[1]=8;
        nums[2]=9;
        for(int n:nums){
            System.out.println(n+" ");
        }
        System.out.println();
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
    }
    
}
