package ProjectGurgram.Leetcodes.BasicMath;

public class plusone {
    public static void main(String[] args) {
        int[] arr ={2,4,8,7};
        System.out.println(plusOne(arr));
    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }
}
