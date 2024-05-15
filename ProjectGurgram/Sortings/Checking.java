package ProjectGurgram.Sortings;

import java.util.Arrays;

public class Checking {
    public static void main(String[] args) {
        int [] unsorted_arr  = {20,35,26,45,12,7,6,89,1,2};

        selection_sorting(unsorted_arr);
        System.out.println(Arrays.toString(unsorted_arr));

    }
    static void selection_sorting(int[] arr){
        for (int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maximum = getmax(arr,0,last);
        swapping(arr,maximum,last);
        }

    }
    static int getmax(int[] arr,int first,int end){
        int max= first;
                for(int i=first;i<=end;i++){
                    if(arr[max]<arr[i]){
                        max = i;
                    }
                }
                return max;
    }
    static void swapping(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
                arr[second]=temp;
    }
}
