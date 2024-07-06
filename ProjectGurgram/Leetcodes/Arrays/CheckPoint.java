package ProjectGurgram.Leetcodes.Arrays;

import java.util.HashMap;
import java.util.Map;

public class CheckPoint {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
//        System.out.println(removeDuplicatesfromArray(arr));

        int[] arr1 ={2,8,7,11,15};
        int target=9;
//        System.out.println(twoSumProblme(arr1,target));
        System.out.println(TwosumProblemMap(arr1,target));
    }

    static int removeDuplicatesfromArray(int[] arr){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(i<arr.length-1 && arr[i]==arr[i+1]){
                continue;
            }
            arr[count]=arr[i];
            count++;
        }
        return count;
    }
//
    static int[] twoSumProblme(int[] arr,int target){
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if(arr[j]+arr[j-i]==target){
                    return new int[]{j,j-i};
                }
            }
        }
        return null;
    }

    static int[] TwosumProblemMap(int[] arr, int tar){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0;i<arr.length;i++){
            int compliment = tar-arr[i];
            if (map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }
            map.put(arr[i],i);
        }
        throw new IllegalArgumentException("No two indexes");
    }
}
