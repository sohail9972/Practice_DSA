package ProjectGurgram.Leetcodes.BasicMath;

public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(isUgly(152));
    }
        public static boolean isUgly(int n) {
            if (n <= 0) {
                return false;
            }
            int[] primes = {2, 3, 5};
            for (int p : primes) {
                while (n % p == 0) {
                    n /= p;
                }
            }

            return n == 1;
        }
    }
