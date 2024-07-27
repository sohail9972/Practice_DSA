package ProjectGurgram.StringsProblems;

import java.util.HashMap;
import java.util.Map;

public class firstUniquecharacterinString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
    public static int firstUniqChar(String s) {
        int index=-1;
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            int maxFreq = map.getOrDefault(ch,0);
            map.put(ch,(maxFreq+1));
        }
        for (int i=0;i<s.length();i++){
            if (map.get(s.charAt(i))==1){
                index=i;
                break;
            }
        }
        return index;
    }
}
