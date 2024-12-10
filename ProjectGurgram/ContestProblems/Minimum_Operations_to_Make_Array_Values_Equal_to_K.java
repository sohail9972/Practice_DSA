package ProjectGurgram.ContestProblems;

import java.util.HashSet;

public class Minimum_Operations_to_Make_Array_Values_Equal_to_K {
    public static void main(String[] args) {

    }
    public static int minOperations(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int i =0;
        for (int num : nums){
            set.add(num);
        }
        for (int num: set){
            if (num==k)     continue;

            if(num<k){
                return -1;

            }
            i++;
        }
        return i;
    }
}
