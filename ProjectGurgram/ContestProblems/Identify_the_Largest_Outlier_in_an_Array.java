package ProjectGurgram.ContestProblems;

import java.util.HashMap;
import java.util.Map;

public class Identify_the_Largest_Outlier_in_an_Array {
    public static void main(String[] args) {

    }
    public static int getLargestOutlier(int[] nums) {
        long totalSum=0;
        Map<Integer,Integer> freqMap = new HashMap<>();

        for (int num:nums){
            totalSum += num;
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }

        int maxOutlier = Integer.MIN_VALUE;
        for (int num : nums){
            long requiredSum = totalSum-num;
            if(requiredSum % 2 != 0) continue;

            long potentialSum = requiredSum / 2 ;
            freqMap.put(num,freqMap.get(num)-1);
            int sumElement = (int) potentialSum;
            int count = freqMap.getOrDefault(sumElement,0);
            if (count>0) maxOutlier = Math.max(maxOutlier,num);
            freqMap.put(num,freqMap.get(num)+1);
        }
        return maxOutlier;

    }
}
