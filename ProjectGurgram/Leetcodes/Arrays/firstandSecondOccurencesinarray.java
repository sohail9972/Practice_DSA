package ProjectGurgram.Leetcodes.Arrays;

public class firstandSecondOccurencesinarray {
    public static void main(String[] args) {
                int []arr = {5,7,7,8,8,10};
                int target =8;
        System.out.println(searchRange2(arr,target));
    }
    public static int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums,target);
        if(lb==nums.length && nums[lb]!=target) {
            return new int[]{-1,-1};
        }
        return new int[]{lb,upperBound(nums,target)-1};
    }
    public static int lowerBound(int []arr, int x) {
        int start=0;
        int last = arr.length-1;
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
    public static int upperBound(int []arr, int x){
        int start=0;
        int last = arr.length-1;
        int lowerBoundAnswer=arr.length;
        while(start<=last){
            int mid = start + (last-start)/2;
            if (arr[mid]>x){
                lowerBoundAnswer=mid;
                last=mid-1;
            }else {
                start=mid+1;
            }

        }
        return lowerBoundAnswer;

    }

//using the Binary search only

    public static int[] searchRange2(int[] nums, int target) {
        int[] result ={-1,-1};
        int left = binarySearchMethod(nums,target,true);
        int right = binarySearchMethod(nums,target,false);
        result[0]=left;
        result[1]=right;
        return result;

    }

    public static int binarySearchMethod(int[] arr, int tar,boolean isSearchableLeft){
        int left=0;
        int right= arr.length-1;
        int idx=-1;
        while(left<=right){
            int mid = left + (right-left)/2;

            if(arr[mid]<tar){
                left = mid +1;
            } else if (arr[mid]>tar) {
                right = mid-1;
            }
            else {
                idx=mid;
                if(isSearchableLeft){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            }
        }
        return idx;
    }
}
