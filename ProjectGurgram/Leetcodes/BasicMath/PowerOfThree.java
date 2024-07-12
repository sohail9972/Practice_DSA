package ProjectGurgram.Leetcodes.BasicMath;

public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(powerOfThree(9));
    }

    public static boolean powerOfThree(int n){
        if(n<=0){
            return false;
        }
        while(n!=1){
            if(n%3!=0){
                return false;
            }
            n/=3;
        }
        return true;
    }
}
