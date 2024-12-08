package ProjectGurgram.ContestProblems;

public class TRansFormArray {
    public static void main(String[] args) {
int [] arr= {-1,4,-1};
        System.out.println(constructTransformedArray(arr));
    }

    public static int[] constructTransformedArray(int[] nums) {
        int result[] = new int[nums.length];
        for (int i=0;i< nums.length;i++){
            if (nums[i]>0){
                int newIndex = ((i+nums[i])% nums.length);
                result[i]=nums[newIndex];
            }else if (nums[i]<0){
                int newIndex = ((i+nums[i]) % nums.length);
                if(newIndex<0){
                    newIndex += nums.length;
                }
                result[i]=nums[newIndex];
            }else{
                result[i]=nums[i];
            }
        }
        return result;
    }
}
