package ProjectGurgram.Leetcodes.Arrays;

public class missingNubmerInArray {
    public static void main(String[] args) {
        int nums[]={4,5,6,7,9};
        missingNumber(nums);
    }
    public static void missingNumber(int[] nums){
        int i =nums[0];
        while(i<nums.length){
            if (nums[i]-nums[i-1]==1){
            continue;
            }
            else {
                System.out.println(nums[i-1]+1);
                i++;
            }

        }
    }
}
