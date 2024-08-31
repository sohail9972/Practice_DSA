package ProjectGurgram.Leetcodes.Arrays;

import java.util.Arrays;

class Leetcodeing1 {
    public static void main(String[] args) {
        int [] arr = {9,6,4,2,3,5,7,0,1};
        missingNumber(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int missingNumber(int[] nums) {

        int sum = 0;
        for(int i = 0;i<nums.length;i++){

            sum+=i;
            sum-=nums[i];
        }
        return sum+=nums.length;
    }
}
