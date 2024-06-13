package ProjectGurgram.Sortings;

import java.util.Arrays;

public class TrialError2 {
    public static void main(String[] args) {
        int arr[] = {8,7,6,4,5,3,2,1};
        cyclin(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bbs(int[]arr){
        for (int i=0;i< arr.length;i++){
            for (int j=1;j< arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    static void cycs(int []arr){
        int i=0;
        while(i< arr.length){
            int correctid=arr[i]-1;
            if(arr[i]!=arr[correctid]){
                sap(arr,i,correctid);
            }else {
                i++;
            }
        }
//        System.out.println(arr[0]);
    }

    static void sap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static void cyclin(int [] arr){
        int i=0;
        while(i< arr.length){
            int corindex = arr[i]-1;
            if (arr[i] !=arr[corindex]){
                swa(arr,i,corindex);
            }else {
                i++;
            }
        }
    }

    public static void swa(int[] arr, int sirst, int sec) {
        int temp = arr[sirst];
        arr[sirst]=arr[sec];
        arr[sec]=temp;
    }

}
