package ProjectGurgram.StringsProblems;

import java.util.*;

public class SortCharacterByFrequency451 {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
    public static String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch, 1);
            }
        }
        List<Character> chars = new ArrayList<>(map.keySet());
        Collections.sort(chars,(a,b) -> map.get(b)- map.get(a));
        StringBuilder sb = new StringBuilder();
        for (char c : chars){
            for (int i=0;i< map.get(c);i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
