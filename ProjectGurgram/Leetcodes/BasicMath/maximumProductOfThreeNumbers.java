package ProjectGurgram.Leetcodes.BasicMath;

public class maximumProductOfThreeNumbers {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,9,12};
        System.out.println(maximumProduct(arr));
    }
        public static int maximumProduct(int[] nums) {

            int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
            int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;


            for (int num : nums) {

                if (num > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = num;
                } else if (num > max2) {
                    max3 = max2;
                    max2 = num;
                } else if (num > max3) {
                    max3 = num;
                }


                if (num < min1) {
                    min2 = min1;
                    min1 = num;
                } else if (num < min2) {
                    min2 = num;
                }
            }


            int product1 = max1 * max2 * max3;
            int product2 = max1 * min1 * min2;


            return (product1 > product2) ? product1 : product2;
        }


}
