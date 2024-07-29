package ProjectGurgram.StringsProblems;

import java.util.*;

public class FindResultantArrayAfterRemovingAnagrams2273 {
    public static void main(String[] args) {
        String[] strs = {"abba", "baba", "bbaa", "cd", "cd"};

        System.out.println(removeAnagrams(strs));
    }

    public static List<String> removeAnagrams(String[] words) {
        String prev = "";
        List<String> list = new ArrayList<>();
        for (String eachword : words) {
            char[] ch = eachword.toCharArray();
            Arrays.sort(ch);
            String currentword = String.valueOf(ch);
            if (!currentword.equals(prev)) {
                list.add(eachword);
                prev = currentword;
            }
        }
        return list;
    }
}
