package ProjectGurgram.Leetcodes.BasicMath;

public class NumberofBitsbyBitmanipulation {
    public static void main(String[] args) {
        System.out.println(hamCodes(12));
    }

    public static int hamCodes(int n){
        int count=0;
//        int mask =1;
        while(n!=0){
            n=n & n-1;
            count++;
        }
        return count;
    }
}
