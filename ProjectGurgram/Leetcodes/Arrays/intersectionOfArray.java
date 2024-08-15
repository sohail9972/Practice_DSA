package ProjectGurgram.Leetcodes.Arrays;

import java.util.HashSet;

public class intersectionOfArray {
    public static void main(String[] args) {
        int [] arr ={1,2,2,1};
        int [] arr2={2};
        System.out.println(intersection(arr,arr2));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }

        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        int [] arr = new int [set2.size()];
        int x=0;
        for(int i:set2){
            arr[x] = i;
            x++;
        }
        return arr;
    }
}
