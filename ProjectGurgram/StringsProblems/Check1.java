package ProjectGurgram.StringsProblems;

import javax.xml.parsers.SAXParser;

public class Check1 {
    public static void main(String[] args) {
//        String str = "abccba";
//        System.out.println(str(str));

        String[] strs = {"flower","flow","flight"};
        System.out.println(longprefixstr(strs));
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
}
