package ProjectGurgram.Leetcodes.SlidingWindowTechnique.NeedToLearnAlgo;

import java.util.HashMap;
import java.util.Map;

public class Longest_Harmonious_SubSequences {
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,5,3,4,7};
        System.out.println(findLHS(arr));
    }

    public static int findLHS(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        for (int value:nums){
            map.put(value,map.getOrDefault(value,0)+1);
        }
        for (int key:map.keySet()){
            if (map.containsKey(key+1)){
                count =Math.max(count, map.get(key)+map.get(key+1));
            }
        }
return count;
        }
}
