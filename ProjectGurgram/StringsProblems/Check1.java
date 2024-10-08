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

//        String [] strs = {"eat","tea","tan","ate","nat","bat"};
//        System.out.println(groupAnagrams(strs));

//        System.out.println(returnuniqueLetters("pipes"));
//        System.out.println(returnFirstoccurenceofWord("sadbutsad","but"));

//        String[] strs = {"abba", "baba", "bbaa", "cd", "cd"};
//        System.out.println(removingAnagrams(strs));

//        System.out.println(firstAndLastLetter("look","kool"));
//        checkonePlusOne();
//        System.out.println(uniqueCharcterinString("loveleetcode"));
        String[] strs = {"flower","flow","flight"};
        System.out.println(commonPrfixTest(strs));
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

    //    check given string is Palimdrome or not

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

    public static char returnuniqueLetters(String s){
        int index=-1;
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int maxfreq = map.getOrDefault(ch,0);
            map.put(ch,maxfreq+1);
        }
        for (int i=0;i<s.length();i++){
            if (map.get(s.charAt(i))==1){
                index = i;
                break;
            }
        }
        return s.charAt(index);
    }

    public static int returnFirstoccurenceofWord(String hayStack,String needle){
        for (int i=0;i<(hayStack.length()-needle.length()+1);i++){
            if(hayStack.charAt(i)==needle.charAt(0)){
                if(hayStack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
//    String[] strs = {"abba", "baba", "bbaa", "cd", "cd"};
//to remove the anagrams
    public static List<String> removingAnagrams(String[] stringsofWords){
        String prev = "";
        List<String> list = new ArrayList<>();
        for (String eachword:stringsofWords){
            char[] ch = eachword.toCharArray();
            Arrays.sort(ch);
            String current_word = String.valueOf(ch);
            if (!current_word.equals(prev)){
                list.add(current_word);
                prev=current_word;
            }
        }
        return list;
    }

    public static boolean firstAndLastLetter(String s1,String s2){
        if(s1.equals(s2)){
            return true;
        }
        if(s1.length()!=s2.length()){
            return false;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i< s1.length();i++){
            if (s1.charAt(i)==s2.charAt(i)){
                list.add(i);
            }
        }
        if(list.size()!=2){
            return false;
        }
        int index1 = list.get(0);
        int index2 = list.get(1);
        if (s1.charAt(index1)==s2.charAt(index2) && s1.charAt(index2)== s2.charAt(index1)){
            return true;
        }
        return false;
    }

    public static char uniqueCharcterinString(String s){
        int index=-1;
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int maxFreq = map.getOrDefault(ch,0);
            map.put(ch,maxFreq+1);
        }
        for (int i=0;i<s.length();i++){
            if (map.get(s.charAt(i))==1){
                index=i;
                break;
            }

        }
        return s.charAt(index);
    }

    public static String commonPrfixTest(String[] str){
        if (str.length==0) return "";
        String result =str[0];
        for (int i=0;i<str.length;i++){
            while (str[i].indexOf(result)!=0){
                result=result.substring(0,result.length()-1);
            }
        }
        return result;
    }

    public static String largestNumber(int[] nums){
        String[] str = new String[nums.length];
        for (int i=0;i< nums.length;i++){
            str[i]=String.valueOf(nums[i]);
        }
        StringBuilder sb = new StringBuilder("");
        Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
        for (String s : str){
            sb.append(s);
        }
        String result = sb.toString();
        return result.startsWith("0")?"0":result;

    }
    public static void checkonePlusOne(){
        System.out.println("1"+"1");
    }
}
