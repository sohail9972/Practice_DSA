package ProjectGurgram.Sortings;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int [] a = {3,5,1,2,4};
        cycsort(a);
        System.out.println(Arrays.toString(a));
    }
    static void cycsort(int [] arr){
        int i=0;
        while(i < arr.length){
            int correct= arr[i]-1;
            if (arr[i] != arr[correct]){
                swaping(arr,i,correct);
            }else {
                i++;
            }
        }
    }

   static void swaping(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
