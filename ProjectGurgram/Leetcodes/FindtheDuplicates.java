package ProjectGurgram.Leetcodes;

class FindtheDuplicates {
    public static void main(String[] args) {
        int [] arr = {3,3,3,3,3};
        findDuplicate(arr);
    }
    public static void findDuplicate(int[] nums) {
        int index = 0 ;
        for(int i =0;i<=nums.length;i++){

            index= index ^ i;
        }
        for(int num : nums){
            if (nums[index] != index + 1){
                index = index ^ num ;

            }
        }
        System.out.println(nums[index]);

    }
}