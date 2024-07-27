package ProjectGurgram.StringsProblems;

import java.util.HashMap;
import java.util.Map;

public class lettertoappearTwiceinString {
    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abccbaacz"));
    }
    public static char repeatedCharacter(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            int maxFreq = map.getOrDefault(ch, 0);
            map.put(ch, maxFreq + 1);
            if (map.get(s.charAt(i)) >= 2)
                return s.charAt(i);
        }
        return ' ';
    }
}
