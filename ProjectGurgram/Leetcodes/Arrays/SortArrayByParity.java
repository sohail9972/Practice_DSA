package ProjectGurgram.Leetcodes.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {

    }
    public static int[] sortArrayByParity(int[] nums) {
        int start=0; int last= nums.length-1;
        while(start<last){
            if (nums[start]%2==0){
                start++;
            } else if (nums[last]%2!=0) {
                last--;
            }else {
                swappingOps(nums,start,last);
                start++;
                last--;
            }
        }
        return nums;
    }
    public static void swappingOps(int[] arr,int start,int last){
        int temp=arr[start];
        arr[start]=arr[last];
        arr[last]=temp;
    }
}
