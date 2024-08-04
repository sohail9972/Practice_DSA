package ProjectGurgram.StringsProblems;

import java.util.ArrayList;

public class MaximumSumofDistinctSubarraysWithLengthK2461 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int fixedwindowsize=3;
        System.out.println(maximumSubarraySum(arr,fixedwindowsize));
    }
    public static long maximumSubarraySum(ArrayList<Integer> nums, int k) {
        int  start=0;
        int end =0;
        long sum=0;
        long max= Long.MAX_VALUE;
        while(end< nums.size()){
                sum = sum +nums.get(end);
            if(end-start+1 < k){
                end++;
            } else if (end-start+1==k) {
                    max = Math.max(max, sum);
                    sum = sum - nums.get(start);
                    start++;
                    end++;
            }
        }
return max;
    }
}
