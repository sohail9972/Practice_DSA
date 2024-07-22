package ProjectGurgram.StringsProblems;

import java.util.HashSet;

public class UniqueLengthofLongestString {
    public static void main(String[] args) {
        System.out.println(uniqueSubstrings("abcabcdb"));
    }
    public static int uniqueSubstrings(String s) {
//        by Sliding Window Method
        HashSet<Character> map;
        map = new HashSet<>();
        int left =0;
        int longestSubString = 0;
        for (int i=0;i<s.length();i++){
            while (map.contains(s.charAt(i))){
                map.remove(s.charAt(left));
                left++;
            }
//            here i is nothing but the right
          int windowLength  =(i-left)+1;
            longestSubString=Math.max(longestSubString,windowLength);
            map.add(s.charAt(i));
        }
        return longestSubString;
    }
}
