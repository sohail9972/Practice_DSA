package ProjectGurgram.Leetcodes.BasicMath;

public class thirdMaximumValueinArray {
    public static void main(String[] args) {
        int[] arr ={3,2,1};
        System.out.println(thirdMax(arr));
    }
    public static int thirdMax(int[] nums) {
        long thirdValue = Long.MIN_VALUE;
        long secondValue=Long.MIN_VALUE;
        long max = Long.MIN_VALUE;
        for (int num : nums){
            if (num>max){
                thirdValue = secondValue;
                secondValue=max;
                max=num;
            } else if (num>secondValue && num<max) {
                thirdValue=secondValue;
                secondValue=num;
            }
            else if (num>thirdValue && num<secondValue){
                thirdValue=num;
            }
        }
        int result = (thirdValue==Long.MIN_VALUE) ?(int)max :(int)thirdValue;
        return result;
    }
}
