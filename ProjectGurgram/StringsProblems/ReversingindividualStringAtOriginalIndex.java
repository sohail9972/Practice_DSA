package ProjectGurgram.StringsProblems;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;

public class ReversingindividualStringAtOriginalIndex {

        public static void main(String[] args) {
            System.out.println(reverseWordsAtIndex("This is Swiggy Interview"));
        }
public static String reverseWordsAtIndex(String s) {

            int start=0;
            char[] arr = s.toCharArray();
            for (int i=0;i<arr.length;i++){
                if (i==arr.length-1 || arr[i+1]==' '){
                    reverseWords(arr,start,i);
                    start=i+2;
                }
            }
return new String(arr);
        }

        public static void reverseWords(char [] arr,int start,int end){
            while(start<end){
                char temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }

}
