package ProjectGurgram.Leetcodes.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Two_Sums {

    public static void main(String[] args) {
        int[] arr = {2,8,7,11,15};
       int tar=9;


        System.out.println(twoSum(arr,tar));
    }
    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            int complimentResult= target-nums[i];

//            check for the Compliment Result in the HashMap
            if(map.containsKey(complimentResult)){
                return new int[]{map.get(complimentResult),i};

//                adding the elements in Hashmap for the subsequent Searches

            }
            map.put(nums[i],i);
        }

     throw new IllegalArgumentException("No two indexes");
    }
}
