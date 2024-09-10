package ProjectGurgram.Coding360Problems.Arrays;

public class ReverseTheArrayusingArray {
    public static void main(String[] args) {

    }
    public void rotate(int[] nums, int k) {
        int start=0;
        int last= nums.length-1;
        while(start<k){
            int temp=nums[start];
            nums[start]=nums[last];
            nums[last]=temp;
            start++;
            last--;
        }
    }
}
