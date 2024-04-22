package ProjectGurgram.Sortings;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int arr[]={56,12,45,75,86,95,2,1,32,25};
        slectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void slectionSort(int arr[]){
        for (int i=0;i< arr.length;i++) {
            //arr.length-i-1 is because the Array gets reduces its size in upcoming iteration
            //the Last Value always starts switch leaving behind the Element at Correct Index
            int last = arr.length - i - 1;
            int maxeleinarray=getmaxinarr(arr,0,last);
            swapping(arr,maxeleinarray,last);

        }
    }

    static int getmaxinarr(int arr[],int start, int end){
        int max=start;
        for (int i=start;i<=end;i++){
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static void swapping(int arr[],int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
