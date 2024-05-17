package ProjectGurgram.StringsProblems;

import java.util.Locale;

public class palimdrometwopointer {
    public static void main(String[] args) {
        String str = "abcddca";
        System.out.println(palimdrome(str));
    }
    static boolean palimdrome(String str){
        if (str == null || str.length()==0){
            return true;
        }
        str=str.toLowerCase();
        for (int i=0;i<str.length();i++){
            char start= str.charAt(i);
            char last = str.charAt(str.length()-1-i);

            if(start != last){
                return false;
            }

        }
        return true;
    }
}
