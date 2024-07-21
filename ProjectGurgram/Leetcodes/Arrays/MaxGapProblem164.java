package ProjectGurgram.Leetcodes.Arrays;

public class MaxGapProblem164 {
    public static void main(String[] args) {
        int[] arr = {3,6,9,1};
        System.out.println(maximumGap(arr));
    }
    public static int maximumGap(int[] nums) {
        int maxGap=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            maxGap=Math.max(maxGap,(nums[left]-nums[right]));
            if(nums[left]<nums[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxGap;
    }
}
