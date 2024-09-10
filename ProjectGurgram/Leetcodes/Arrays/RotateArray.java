package ProjectGurgram.Leetcodes.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k=3;
        rotate(arr,k);
    }
    public static void rotate(int[] nums, int k) {
        k%= nums.length;
        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k, nums.length-1);
    }
    public static void reverseArray(int[] nums,int start,int last){
        while(start<=last){
            int temp=nums[start];
            nums[start]=nums[last];
            nums[last]=temp;
            start++;
            last--;
        }
    }
}
