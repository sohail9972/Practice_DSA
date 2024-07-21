package ProjectGurgram.StringsProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(validPar("()[]{}"));
    }

    public static boolean validPar(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char c : s.toCharArray()) {
            if (map.containsValue(c)) {
                st.push(c);
            } else if (map.containsKey(c)) {
                if (st.isEmpty() || map.get(c) != st.pop()) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}