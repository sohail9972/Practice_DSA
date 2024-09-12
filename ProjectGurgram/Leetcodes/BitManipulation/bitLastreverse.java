package ProjectGurgram.Leetcodes.BitManipulation;

public class bitLastreverse {
    public static void main(String[] args) {
        int start =5;
        int goal=2;
        System.out.println(minBitFlips(start,goal));
    }
    public static int minBitFlips(int start, int goal) {
        int ans=0;
        int xor = start ^ goal;
        while(xor!=0){
            ans +=xor&1;
            xor >>=1;
        }
        return ans;
    }
}
