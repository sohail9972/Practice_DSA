package ProjectGurgram.Leetcodes.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quadrapletsinarray {
    public static void main(String[] args) {
        int[] arr ={1,1,1,3,5};
        System.out.println(countQuadruplets(arr));
    }
    public static int countQuadruplets(int[] nums) {
        int result = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i1=0;i1< nums.length-3;i1++){
            for (int i2=i1+1;i2< nums.length-2;i2++){
                int sum = nums[i1]+nums[i2];
                List<Integer> list = map.getOrDefault(sum,new ArrayList<>());
                map.put(sum,list);
                list.add(i2);
            }
        }
        for (int i4= nums.length-1;i4>2;i4--){
            for (int i3 = i4-1;i3>1;i3--){
                int sum = nums[i4]-nums[i3];
                if (map.containsKey(sum)){
                    List<Integer> list = map.get(sum);
                    for (int i2:list) if(i2<i3) result++;
                }
            }
        }
    return result;
    }
}
