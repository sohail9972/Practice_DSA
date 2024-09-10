package ProjectGurgram.Coding360Problems.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseTheArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int m=3;
        reverseArray(list,m);
    }
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
//        int start=Math.max(0,m+1);
//        int last= arr.size()-1;
//        for (int i=start,j=last;i<j;i++,j--) {
//
//            int temp=arr.get(i);
//            arr.set(i,arr.get(j));
//            arr.set(j,temp);
//        }
        int start=m+1;
        int last= arr.size()-1;
        while (start<last){

            int temp=arr.get(start);
            arr.set(start,arr.get(last));
            arr.set(last,temp);
            start++;
            last--;
        }
    }
}
