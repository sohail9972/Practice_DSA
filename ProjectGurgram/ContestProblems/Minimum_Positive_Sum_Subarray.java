package ProjectGurgram.ContestProblems;

import java.util.List;

public class Minimum_Positive_Sum_Subarray {
    public static void main(String[] args) {
//        List arr [] = {3, -2, 1, 4};
//        int l=-2;int r =3;
//        System.out.println(minimumSumSubarray(arr,l,r));

    }
    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] preSum = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            preSum[i] = preSum[i - 1] + nums.get(i - 1);
        }

        int res = Integer.MAX_VALUE;

        for (int range = l; range <= r; range++) {
            for (int i = range; i <= n; i++) {
                int v = preSum[i] - preSum[i - range];
                if (v > 0) {
                    res = Math.min(res, v);
                }
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
