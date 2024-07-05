package ProjectGurgram.Leetcodes.Arrays;

public class Two_Sum_Twoloop {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int tar=9;


        System.out.println(twoSum(arr,tar));
    }
    static int[] twoSum(int[] nums, int target) {
        for (int i=1;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j]+nums[j-i]==target){
                    return new int[]{j,j-i};

                }
            }
        }
        return null;
    }
}
