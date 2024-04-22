package ProjectGurgram.Sortings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {8,7,6,4,5,3,2,1};
        bbSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bbSorting(int arr[]){
        boolean swapped;
        for (int i=0;i<arr.length;i++){
            swapped=false;
            for (int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if (!swapped){ //swap==false which mean the Array is already sorted
                break;
            }
        }

    }
}
