package ak;
import java.util.*;
class xy {
    public void rotate(int[] nums, int k){
        int j=nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(i<=j){
                nums[i]=nums[i+3];
            }
            else{
                nums[i]=nums[i-j];
            }
        }
        System.out.println(nums);   
        }   
    }
class Solution{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        xy obj=new xy();
        System.out.println("Enter the size of array:");
        int k=sc.nextInt();
        int[] nums= new int[k];
        for(int i=0;i<k;i++){
            nums[i]=sc.nextInt();
        }
        xy.rotate(nums,k);
    }
}
