package ProjectGurgram.Leetcodes.BasicMath;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(45));
    }
    public static int arrangeCoins(int n) {
        long low = 0, high =  n;
        while(low <= high){
            long mid = low + (high - low)/2;
            long currCoins = (mid * (mid + 1))/2;
            if(currCoins == n) return (int)mid;
            else if(currCoins < n) low = mid + 1;
            else high = mid - 1;
        }
        return (int)high;
    }
}
