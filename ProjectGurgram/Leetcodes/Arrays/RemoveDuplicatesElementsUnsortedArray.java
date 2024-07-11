package ProjectGurgram.Leetcodes.Arrays;

import java.util.HashMap;

public class RemoveDuplicatesElementsUnsortedArray {
    public static void main(String[] args) {
        int [] arr ={1,1,4,4,5,7,6};
    RemoveDuplicatesunsortedWithoutDuplicate(arr);
    }

    private static void RemoveDuplicatesunsortedWithoutDuplicate(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                System.out.println(arr[i]);
                map.put(arr[i],i);
            }
        }
    }
}
