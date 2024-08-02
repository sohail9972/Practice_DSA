package ProjectGurgram.StringsProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class SwappinglasttoFirstLetterinString {
    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank", "kanc"));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                list.add(i);
            }
        }
        if (list.size() != 2) {
            return false;
        }
        int index1 = list.get(0);
        int index2 = list.get(1);
//        swapping the number
        if (s1.charAt(index1) == s2.charAt(index2) &&
                s1.charAt(index2) == s2.charAt(index1)) {
            return true;
        }
        return false;
    }
}
