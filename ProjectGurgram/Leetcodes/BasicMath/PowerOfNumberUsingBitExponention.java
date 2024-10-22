package ProjectGurgram.Leetcodes.BasicMath;

public class PowerOfNumberUsingBitExponention {
    public static void main(String[] args) {
        System.out.println(myPow(7,11));
    }
    public static double myPow(double a, int b) {
        if(b < 0){
            b = -b;
            a = 1 / a;
        }
        double pow = 1;
        while(b != 0){
            if((b & 1) != 0){
                pow *= a;
            }
            a *= a;
            b >>>= 1;
        }
        return pow;
    }
}
