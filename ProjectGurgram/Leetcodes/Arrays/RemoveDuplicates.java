package ProjectGurgram.Leetcodes.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
    int [] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));

    }

    static int removeDuplicates(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length;i++){
            if (i<nums.length-1 && nums[i]==nums[i+1]) {
                continue;
            }else{
                nums[count] = nums[i];
                count++;
            }

        }
        return count;
    }
}
