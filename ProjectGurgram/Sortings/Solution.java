package ProjectGurgram.Sortings;

class Solution {

    public int missingNumber(int[] nums) {


        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[correctIndex] != nums[i] && nums[i] < nums.length) {
                swappingOps(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[j]) {
                return j;
            }


        }
        return nums.length;
    }


    void swappingOps(int[] nums, int first, int second) {
    int temp= nums[first];
    nums[first]=nums[second];
    nums[second]=temp;
    }
}