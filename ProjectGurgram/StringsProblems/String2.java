package ProjectGurgram.StringsProblems;

import java.util.Arrays;

public class String2 {
    public static void main(String[] args) {
//        String str="sohail";
//        reverseentireString(str);
        String str="sohail";
        char[] string = str.toCharArray();
        String rev="";
        for (int i=string.length-1;i>=0;i--){
            rev=rev+ string[i];

        }
        System.out.println(rev);
    }
//    static String reverseentireString(String s){
//        char[] string = s.toCharArray();
//        String rev="";
//        for (int i=string.length-1;i>=0;i--){
//            rev=rev+ string[i];
//        }
//        return rev;
//
//    }
    static void reverse(){
        String str="sohail";
        char[] string = str.toCharArray();
        String rev="";
        for (int i=string.length-1;i>=0;i--){
            rev=rev+ string[i];
            System.out.println(rev);
        }
    }
}
