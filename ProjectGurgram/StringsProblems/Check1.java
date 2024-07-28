package ProjectGurgram.StringsProblems;

import java.util.*;

public class Check1 {
    public static void main(String[] args) {
//        String str = "abccba";
//        System.out.println(str(str));
//
//        String[] strs = {"flower","flow","flight"};
//        System.out.println(longprefixstr(strs));

//        System.out.println(validParthenese("[]{}()"));

        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    static String longprefixstr(String[] s){
        if (s.length==0) return "";
        String firstWordofArray = s[0];


        for(int i=1;i<s.length;i++){
            while(s[i].indexOf(firstWordofArray)!=0){
                firstWordofArray=firstWordofArray.substring(0,firstWordofArray.length()-1);
            }

        }

        return firstWordofArray;
    }

    static boolean str(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char start = s.charAt(i);
            char last = s.charAt(s.length() - 1 - i);

            if (start != last) {
                return false;
            }
        }
        return true;

    }

    public static boolean validParthenese(String s){
        Stack<Character> st = new Stack<>();
        Map<Character,Character> map = new HashMap<>();

        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for (char c : s.toCharArray()){
            if (map.containsValue(c)){
                st.push(c);
            } else if (map.containsKey(c)) {
                if (st.isEmpty() || map.get(c) != st.pop()){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String eachwordsoflistofString : strs){
            char[] ch = eachwordsoflistofString.toCharArray();
            Arrays.sort(ch);
//            creating new String using sorted word
            String eachWordthatissorted = new String(ch);
            if (!map.containsKey(eachWordthatissorted)){
                map.put(eachWordthatissorted,new ArrayList<>());
            }
            map.get(eachWordthatissorted).add(eachwordsoflistofString);
        }
        return new ArrayList<>(map.values());
    }
}
