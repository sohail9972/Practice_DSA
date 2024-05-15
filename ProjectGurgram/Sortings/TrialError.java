package ProjectGurgram.Sortings;

import java.util.Arrays;

public class TrialError {
    public static void main(String[] args) {
        int[] mainarr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        cyclicsorting(mainarr);
//        System.out.println(Arrays.toString(mainarr));
    }

    static int cyclicsorting(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[correctIndex] != nums[i]) {
                swappingOps(nums, i, correctIndex);
            } else {
                i++;
            }
        }
//        for(int num:nums){
//            if (nums[num] !=num && num <nums.length){
//                return num;
//            }
//        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;

            }

            return nums.length;
        }


        static void swappingOps ( int[] nums, int first, int second){
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }
    }
}
