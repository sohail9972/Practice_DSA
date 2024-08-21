package ProjectGurgram.Leetcodes.BasicMath;

public class validPerfectsquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(56));
    }
    public static boolean isPerfectSquare(int num) {
        int l = 0, h = num, mid = 0;
        while (l <= h) {
            mid = l + (h - l) / 2;
            long pow = (long)mid * mid;
            if (pow == num)
                return true;
            else if (pow < num)
                l = mid + 1;
            else
                h = mid - 1;
        }
        return false;
    }
}
