package ProjectGurgram.Leetcodes.Arrays;

public class MaximumSumSubArray {
    public static void main(String[] args) {
int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSumofSubarry(arr));

    }

    public static int maxSumofSubarry(int[] arr){
        int ans= Integer.MIN_VALUE;
        int current_Sum=0;
        for (int i=0;i<arr.length;i++){
            current_Sum += arr[i];
//            ans =Integer.max(ans,current_Sum);
            if(current_Sum>ans){
                ans=current_Sum;
            }
            if(current_Sum<0){
                current_Sum=0;
            }
        }

        return ans;
    }
}
