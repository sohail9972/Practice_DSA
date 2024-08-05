package ProjectGurgram.Leetcodes.SlidingWindowTechnique;

public class maximumAverageOfSubarrayofSizek643 {
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int windowsixe = 4;
        System.out.println(findMaxAverage(arr, windowsixe));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxAverage = sum;
        int start = 0;
        int end = k;
        while (end < nums.length) {
            sum -= nums[start];
            start++;

            sum += nums[end];
            end++;

            maxAverage = Math.max(maxAverage,sum);
        }
        return maxAverage/k;
    }
}
