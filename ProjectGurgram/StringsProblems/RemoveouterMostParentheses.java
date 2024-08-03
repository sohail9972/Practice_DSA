package ProjectGurgram.StringsProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RemoveouterMostParentheses {
    public static void main(String[] args) {

    }
    public static String removeoutermostString(String s){
        Stack<Character> st = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){

            }
        }
return null;
    }
}
