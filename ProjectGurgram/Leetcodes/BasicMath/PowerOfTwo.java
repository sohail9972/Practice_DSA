package ProjectGurgram.Leetcodes.BasicMath;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(4));
    }
    public static boolean powerOfTwo(int n){
        if (n<=0){
            return false;
        }
        while(n!=1){
            if(n%2!=0){
                return false;
            }
            n/=2;
        }
        return true;
    }
}
