package ProjectGurgram.Leetcodes.SlidingWindowTechnique;

import java.util.HashSet;

public class ContinuousSubarraySum {
    public static void main(String[] args) {
        int[] arr = {23,2,6,4,7};
        int k = 6;
        System.out.println(checkSubarraySum(arr, k));
    }

    //    23,2,4,6,7 k = 6
//    window siz of 2
    public static boolean checkSubarraySum(int[] nums, int k) {
//        int sum = 0;
//        int windosize = (k/k)+1;
//        for (int i = 0; i < windosize; i++) {
//            sum += nums[i];
//        }
//        int maxDivisible = sum;
//        int strat = 0;
//        int end = windosize;
//        while (end < nums.length) {
//            if (nums[strat]% k ==0 || nums[end]%k==0){
//                return true;
//            }
//            sum -= nums[strat];
//            strat++;
//
//            sum += nums[end];
//            end++;
//
//            maxDivisible = Math.max(maxDivisible, sum);
//            if (maxDivisible % k==0)
//                return true;
//            }
//            return false;

        HashSet<Integer> set = new HashSet<>();
        int currentvalue=0;
        int previousValue=0;
        for(int i=0;i<nums.length;i++){
            int sum = nums[i];
            currentvalue += sum;
            currentvalue %= k;
            if(set.contains(currentvalue)){
                return true;
            }
            set.add(previousValue);
            previousValue=currentvalue;
        }
        return false;
        }
    }