package ProjectGurgram.Leetcodes.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDupliate217 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));

    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> setwithoutDuplicate = new HashSet<>();
        for (int eachNumber : nums) {
            if (setwithoutDuplicate.contains(eachNumber)) {
                return true;
            }
            setwithoutDuplicate.add(eachNumber);
        }
        return false;
    }
}
