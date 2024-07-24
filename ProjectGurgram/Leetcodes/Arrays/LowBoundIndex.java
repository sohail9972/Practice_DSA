package ProjectGurgram.Leetcodes.Arrays;

public class LowBoundIndex {
    public static void main(String[] args) {
        int[] arr ={1,2,2,3,3,5};
        int x = 2;
        int n = arr.length;
        System.out.println(lowerBound(arr,n,x));
    }
    public static int lowerBound(int []arr, int n, int x) {
        int start=0;
        int last = n-1;
        int lowerBoundAnswer=x;
        while(start<=last){
            int mid = start + (last-start)/2;
            if (arr[mid]>=x){
                lowerBoundAnswer=mid;
                last=mid-1;
            }else {
                start=mid+1;
            }
        }
        return lowerBoundAnswer;
    }
}
