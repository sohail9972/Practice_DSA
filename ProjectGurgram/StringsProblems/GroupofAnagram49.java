package ProjectGurgram.StringsProblems;

import java.util.*;

public class GroupofAnagram49 {
    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for (String eachWord :strs){
            char[] ch = eachWord.toCharArray();
            Arrays.sort(ch);
            String sortdWord = new String(ch);
//            sorted words will be keys
            if (!map.containsKey(sortdWord)){
                map.put(sortdWord,new ArrayList<>());
            }
            map.get(sortdWord).add(eachWord);
        }
        return new ArrayList<>(map.values());
    }
}
