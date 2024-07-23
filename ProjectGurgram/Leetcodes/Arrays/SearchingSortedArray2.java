package ProjectGurgram.Leetcodes.Arrays;

public class SearchingSortedArray2 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1};
       int tar=0;
        System.out.println(search(arr,tar));

    }
    public static boolean search(int[] arr, int tar) {
        int s=0; int l=arr.length-1;
        while(s<=l){
            int mid=s+(l-s)/2;

            if(arr[mid]==tar){
                return true;
            }
            if(arr[s]==arr[mid] && arr[mid]==arr[l]){
                s=s+1;
                l=l-1;
                continue;
            }
            if (arr[s]<=arr[mid]) {
                if(arr[s]<=tar && tar<=arr[mid]){
                    l = mid-1;
                }else {
                    s = mid + 1;
                }
            }else {
                if(arr[mid]<=tar && tar<=arr[l]){
                    s=mid+1;
                }else {
                    l = mid - 1;

                }
            }
        }
        return false;
    }
}
