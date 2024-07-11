package ProjectGurgram.StringsProblems;

import java.util.Stack;

public class ReversingWordsofString {
    public static void main(String[] args) {
        System.out.println(reverseWords("Hello I am Sohail"));
    }

    public static String reverseWords(String s) {
        char[] charArray = s.toCharArray();
        Stack<String> st = new Stack<>();
        String word = "";

        for (int i = 0; i < s.length(); i++) {
            while (i < s.length() && charArray[i] == ' ') {
                i++;
            }
            while (i < s.length() && charArray[i] != ' ') {
                word += charArray[i];
                i++;
            }
            st.push(word);
            word = "";
        }
        String ans = "";
        while (!st.empty()) {
            String top = st.pop();
            String sy =reversetopWords(top);
            st.push(sy);
            String continueremove = st.pop();

            ans= ans + " " + continueremove;
        }
        return ans.trim();
//        }
    }
    public static String reversetopWords(String s){
        String str = "";
        char[] ch = s.toCharArray();
        for (int i=s.length()-1;i>=0;i--){
            str += ch[i];
        }
        return str;
    }
}
