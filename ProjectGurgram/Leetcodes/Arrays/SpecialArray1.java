package ProjectGurgram.Leetcodes.Arrays;

public class SpecialArray1 {

    public static void main(String[] args) {
        int[] arr = {4,1,2,3,5,6};
        System.out.println(isArraySpecial(arr));

    }
    public static boolean parity(int x){
        if(x%2==0){
            return true;
        }
        return false;
    }

    public static boolean isArraySpecial(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(parity(nums[i])==parity(nums[i-1])){
                return false;
            }

        }
        return true;

    }
}
