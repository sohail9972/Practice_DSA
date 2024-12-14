package ProjectGurgram.ContestProblems.DailyProblemQuestion;

import java.util.TreeMap;

public class ContinuousSubarrays2762 {
    public static void main(String[] args) {

    }
    public static long countContinuousSubarrays(int[] nums) {
         long count=0;
         int windowStartPoint=0;
         int n = nums.length;

//         Treemap's Keys Are sorted and We can Easily Access the
//        Smallest and Largest elements
        TreeMap<Integer,Integer> frequencyMap = new TreeMap<>();

        for (int windowEndPoint=0;windowEndPoint<n;++windowEndPoint){
            frequencyMap.merge(nums[windowEndPoint],1,Integer::sum);
            while(frequencyMap.lastEntry().getKey()-frequencyMap.firstEntry().getKey()>2){
                frequencyMap.merge(nums[windowStartPoint],-1,Integer::sum);

                if (frequencyMap.get(nums[windowStartPoint])==0){
                    frequencyMap.remove(nums[windowStartPoint]);
                }
                ++windowStartPoint;
            }
            count += windowEndPoint-windowStartPoint +1;
        }
        return count;
    }
}

//  Best Solution using Queue need toi understand it
//class Solution {
//    public long continuousSubarrays(int[] nums) {
//        long ans = 0;
//        Deque<Integer> incQ = new LinkedList<>();// for max value in the begining
//        Deque<Integer> decrQ = new LinkedList<>();// for min value in the begining
//
//        int j = -1;
//        for(int i=0;i<nums.length;i++){
//            while(!incQ.isEmpty() && incQ.peekLast() > nums[i]){
//                incQ.pollLast();
//            }
//            incQ.add(nums[i]);
//
//            while(!decrQ.isEmpty() && decrQ.peekLast() < nums[i]){
//                decrQ.pollLast();
//            }
//            decrQ.add(nums[i]);
//
//            while(decrQ.peekFirst()- incQ.peekFirst()>2){
//                j++;
//                if(incQ.peekFirst() == nums[j]) incQ.pollFirst();
//                if(decrQ.peekFirst() == nums[j]) decrQ.pollFirst();
//            }
//            ans = ans + i-j;
//        }
//        return ans;
//        //5 , 4, 5 4, 2, 2 4, 4, 4 2 4, 2 4
//
//    }
//
//}
