package ProjectGurgram.StringsProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Strings3 {
    public static void main(String[] args) {
        String[] arr = {"File", "nmae"};
        for (int i=0;i<arr.length;i++){
            reversestring(arr[i]);
        }
    }

    static void reversestring(String str) {
        char[] c = str.toCharArray();
        String rev = "";
        for (int i = c.length - 1; i >= 0; i--) {
            rev += c[i];
        }

    }
}
