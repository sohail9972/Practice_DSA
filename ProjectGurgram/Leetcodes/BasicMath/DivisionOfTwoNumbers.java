package ProjectGurgram.Leetcodes.BasicMath;

public class DivisionOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println(divide(7, -3));
    }

    public static int divide(int dividend, int divisor) {
//Brute Force Method
//        int sum =0;int count=0;
//        while(sum+divisor<=dividend){
//            count++;
//            sum = sum+divisor;
//
//        }
//        return count;
//    }

//    Optimal Approach
        if (dividend == divisor) {
            return 1;
        }
        boolean sign = true;
        if (dividend >= 0 && divisor < 0) {
            sign = false;
        }
        if (dividend <= 0 && divisor > 0) {
            sign = false;
        }
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        divisor = Math.abs(divisor);
        long qoutient = 0;
        while (n >= 0) {
            int cnt = 0;
            while (n >= (d << (cnt + 1))) {
                cnt += 1;
            }
            qoutient += 1 << cnt;
            n -= (d << cnt);
        }
        if (qoutient == (1L << 31) && sign) {
            return Integer.MAX_VALUE;
        }
        if (qoutient == (1L << 31) && !sign) {
            return Integer.MIN_VALUE;
        }
        return sign ? (int) qoutient : (int) -qoutient;
    }
}