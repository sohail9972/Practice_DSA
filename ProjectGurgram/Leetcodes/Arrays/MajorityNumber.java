package ProjectGurgram.Leetcodes.Arrays;

public class MajorityNumber {
    public static void main(String[] args) {
        int[] arr ={15,4,10,2,5,8,4};
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
