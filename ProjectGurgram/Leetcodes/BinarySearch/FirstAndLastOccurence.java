package ProjectGurgram.Leetcodes.BinarySearch;

import java.util.ArrayList;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int [] arr = {0,1,1,5};
        int k =1;
        System.out.println(firstAndLastPosition(arr,k));
    }

//    getting First nad Last Occurence using Complete Binary Search Algo

    public static int[] firstAndLastPosition(int[] arr, int k) {
        // Write your code here.

        int first =firstOccurence(arr,k);
        if (first==-1) return new int[]{-1, -1};

        int last = lastOccurence(arr,k);
        if (last==-1) return new int[]{-1,-1};
        return new int[]{first, last};
    }

    public static int lastOccurence(int[]arr, int k) {

        int low=0;int high=arr.length-1;
        int last=-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if (arr[mid]==k){
                last=mid;
                low=mid+1;
            } else if (arr[mid]<k) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return last;
    }

    public static int firstOccurence(int[] arr, int k) {
        int low=0;int high= arr.length-1;
        int first=-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if (arr[mid]==k){
                first=mid;
                high=mid-1;
            } else if (arr[mid]<k) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return first;
    }
}
