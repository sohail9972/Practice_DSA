package ProjectGurgram.Leetcodes.Arrays;

import java.util.HashMap;

public class containsDuplicatII2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(arr,k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> numIndices = new HashMap<>();

        for (int currentIndex = 0; currentIndex < n; ++currentIndex) {
            int currentNum = nums[currentIndex];

            if (numIndices.containsKey(currentNum)) {
                if (currentIndex - numIndices.get(currentNum) <= k) {
                    return true;
                }
            }

            numIndices.put(currentNum, currentIndex);
        }

        return false;
    }
}
