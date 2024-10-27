package ProjectGurgram.Leetcodes.SlidingWindowTechnique.NeedToLearnAlgo;

public class Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target=7;
        System.out.println(minSubArrayLen(target,arr));
    }
        public static int minSubArrayLen(int target, int[] nums) {
            int minLen = Integer.MAX_VALUE;
            int left = 0;
            int curSum = 0;

            for (int right = 0; right < nums.length; right++) {
                curSum += nums[right];

                while (curSum >= target) {
                    if (right - left + 1 < minLen) {
                        minLen = right - left + 1;
                    }
                    curSum -= nums[left];
                    left++;
                }
            }

            return minLen != Integer.MAX_VALUE ? minLen : 0;
        }

}
