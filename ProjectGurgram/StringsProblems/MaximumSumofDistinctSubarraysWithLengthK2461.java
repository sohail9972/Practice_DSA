package ProjectGurgram.StringsProblems;

public class MaximumSumofDistinctSubarraysWithLengthK2461 {
    public static void main(String[] args) {
        int[] arr = {1,5,4,2,9,9,9};
        int fixedwindowsize=3;
        System.out.println(maximumSubarraySum(arr,fixedwindowsize));
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        int  start=0;
        int end =0;
        long sum=0;
        long max=0;
        while(end< nums.length){
            if(nums[start]==nums[end]){
                return 0;
            }
            sum = sum +nums[end];
            if(end-start+1 < k){
                end++;
            } else if (end-start+1==k) {
                max=Math.max(max,sum);
                sum=sum-nums[start];
                start++;
                end++;
            }
        }
return max;
    }
}
