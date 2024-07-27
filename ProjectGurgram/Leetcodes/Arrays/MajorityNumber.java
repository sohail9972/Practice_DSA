package ProjectGurgram.Leetcodes.Arrays;

public class MajorityNumber {
    public static void main(String[] args) {
        int[] arr ={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        int count= 0;
        int candiate = 0;
        for (int eachNumber:nums){
            if(count==0){
                candiate=eachNumber;
            }
            if (eachNumber==candiate){
                count++;
            }
            else{
                count--;
            }
        }
        return candiate;
    }
}
