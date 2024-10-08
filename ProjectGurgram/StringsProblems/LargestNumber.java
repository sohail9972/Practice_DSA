package ProjectGurgram.StringsProblems;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int [] arr={10,2};
        System.out.println(Solution.largestNumber(arr));
    }
    class Solution {
        public static String largestNumber(int[] nums) {
            String s[]=new String[nums.length];
            for(int i=0;i<nums.length;i++){
                s[i]=String.valueOf(nums[i]);
            }
            StringBuilder sb=new StringBuilder("");
            Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
            for(String str:s)
            {
                sb.append(str);
            }
            String result=sb.toString();
            return result.startsWith("0")?"0":result;

        }
    }
}
