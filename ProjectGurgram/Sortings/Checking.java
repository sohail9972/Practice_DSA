package ProjectGurgram.Sortings;

import java.util.Arrays;

public class Checking {
    public static void main(String[] args) {
        int arr[]={45,21,35,1,2,45,123,45,36,5,9};
        selction(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selction(int arr[]){
        for (int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxmin = getmaximum(arr,0,last);
            swappingfunction(arr,maxmin,last);
        }
    }
    static int getmaximum(int arr[],int start,int end){
        int maxvalue=start;
        for (int i=start;i<=end;i++){
            if(arr[maxvalue]<arr[i]){
                maxvalue=i;
            }
        }
    return maxvalue;
    }

    static void swappingfunction(int arr[],int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
