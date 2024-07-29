package ProjectGurgram.Leetcodes.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr ={1, 2, 4, 7};
        int tar = 5;
        System.out.println(searchInsert(arr,tar));
    }
    public static int searchInsert(int [] arr, int m){
        int start=0;
        int last =arr.length-1;
        int ans = arr.length;
        while(start<=last){
            int mid = start + (last-start)/2;
            if(arr[mid]>=m){
                ans = mid;
                last = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return ans;
    }

    public int searchInsertLeetCode(int[] nums, int target) {
        int start=0; int last = nums.length-1;
        int ans = nums.length;
        while(start<=last){
            int mid = start + (last-start)/2;
            if(nums[mid]>=target){
                ans = mid;
                last = mid-1;
            }
            else{
                start = mid +1;
            }
        }
    return ans;
    }
}
