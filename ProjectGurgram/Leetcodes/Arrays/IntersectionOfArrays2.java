package ProjectGurgram.Leetcodes.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfArrays2 {
    public static void main(String[] args) {
        int [] arr = {1,2,2,1};
        int [] arr2 = {2, 2};
        System.out.println(intersect(arr, arr2));


    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
        }

        return intersection;
    }
}
