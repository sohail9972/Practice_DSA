package ProjectGurgram.Leetcodes.BasicMath;

public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(powerofFourNumber(15));
    }

    public static boolean powerofFourNumber(int n){
        if(n<=0){
            return false;
        }
        while(n!=1){
            if (n%4==0){
                return false;
            }
            n/=4;
        }
        return true;
    }
}
