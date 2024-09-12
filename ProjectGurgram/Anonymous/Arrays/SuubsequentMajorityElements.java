package ProjectGurgram.Anonymous.Arrays;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

public class SuubsequentMajorityElements {
    public static void main(String[] args) {
        int[] arr ={15,4,10,2,5,8,4};
        majorityElement(arr);
    }
    public static void majorityElement(int[] arr){
//        Stack<Integer> st = new Stack<>();
//        PriorityQueue<Integer> st = new PriorityQueue<>();
        ArrayList<Integer> st = new ArrayList<>();
        int max = arr[arr.length-1];
//        st.push(max);
        st.add(max);
        for (int i=arr.length-2;i>=0;i--){
            if (arr[i]>max){
                st.add(arr[i]);
                max=arr[i];
            }
        }
        for (int i=st.size()-1;i>=0;i--){
            System.out.println(st.get(i));
        }
    }
}
