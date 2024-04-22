package ProjectGurgram.Sortings;

import java.util.Arrays;

public class insertionSortings {
    public static void main(String[] args) {
        int arr[]={56,12,45,75,86,95,2,1,32,25};
        inserting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void inserting(int arr[]){

        //here the Lefth and side elements are sorted
        //j>0 becz j is getting decremented as it progress through Array.
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swapping(arr, j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swapping(int arr[],int next,int previous){
        int temp=arr[next];
        arr[next]=arr[previous];
        arr[previous]=temp;
    }
}
