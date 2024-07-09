package ProjectGurgram.SwiggyTest;

import java.util.Stack;

public class Test2 {
    //"Swiggyinterview"

    public static void main(String[] args) {
        System.out.println(reverseWords("This is Swiggy Interview"));
    }

    public static String reverseWords(String s){
        Stack<String> st = new Stack<>();
        char[] charArray = s.toCharArray();
        String word ="";
        for (int i=0;i<s.length();i++){
            while(i<s.length() && charArray[i]==' '){
                i++;
            }
            while (i<s.length() && charArray[i]!=' '){
                word=word+charArray[i];
                i++;
            }
            st.push(word);
            word="";

        }
//        String ans="";
//        while (!st.empty()){
//
//            String top = st.pop();
//            ans= ans + " " + top;
//        }
return word;
    }

}
