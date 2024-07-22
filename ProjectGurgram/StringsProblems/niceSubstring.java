package ProjectGurgram.StringsProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class niceSubstring {
    public static void main(String[] args) {
        System.out.println(longestNiceSubstring("YazaAay"));

    }
    public static String longestNiceSubstring(String s) {

        if (s.length() < 2) {
            return "";
        }
        Set<Character> st = new HashSet<>();
        for (char ch : s.toCharArray()) {
            st.add(ch);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (st.contains(Character.toLowerCase(c)) && st.contains(Character.toUpperCase(c))) {
                continue;
            }
            String left = longestNiceSubstring(s.substring(0, i));
            String right = longestNiceSubstring(s.substring(i + 1));
            return (left.length() >= right.length())?left:right;
        }
        return s;
    }
}
