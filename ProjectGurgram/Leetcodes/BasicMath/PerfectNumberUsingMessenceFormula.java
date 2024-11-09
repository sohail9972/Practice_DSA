package ProjectGurgram.Leetcodes.BasicMath;

public class PerfectNumberUsingMessenceFormula {
    public static void main(String[] args) {

    }
    public static int messenceprime(int p) {
//        Bitwise Operator for the formula
        return (1 << (p - 1)) * ((1 << p) - 1);
    }
    public static boolean checkPerfectNumber(int num) {
        int[] primes=new int[]{2,3,5,7,13,17,19,31};
        for (int prime: primes) {
            if (messenceprime(prime) == num)
                return true;
        }
        return false;
    }
}
