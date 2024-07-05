package ProjectGurgram.Leetcodes.Arrays;

public class Two_Sum_Sorted {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int tar=9;


        System.out.println(twoSum(arr,tar));
    }

    static int[] twoSum(int[] nums, int target) {

        int start=0;
        int last=nums.length-1;
        while(start<last){
            if (nums[start]+nums[last]==target){
                return new int[]{start+1,last+1};
            } else if (nums[start]+nums[last]<target) {
                start++;
            }
            else {
                last--;
            }

        }


return null;
    }
}
