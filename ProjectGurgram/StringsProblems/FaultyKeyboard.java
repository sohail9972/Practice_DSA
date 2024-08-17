package ProjectGurgram.StringsProblems;

import java.util.Stack;

public class FaultyKeyboard {
    public static void main(String[] args) {
        System.out.println(finalString("String Poiinter"));
    }
    public static String finalString(String s) {
        StringBuilder str = new StringBuilder();
        int movingindex = 0;
        while(movingindex<s.length()){
        if (s.charAt(movingindex)!='i') str.append(s.charAt(movingindex));
        if (s.charAt(movingindex)=='i') str.reverse();
        movingindex++;
        }
        return str.toString();
    }

}
