package ProjectGurgram.Leetcodes.BasicMath;

public class climbingstairsProblem {
    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }
    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n-1) + climbStairs(n-2);

    }
}
