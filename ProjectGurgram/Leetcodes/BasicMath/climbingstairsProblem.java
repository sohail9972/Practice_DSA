package ProjectGurgram.Leetcodes.BasicMath;

public class climbingstairsProblem {
    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }
    public static int climbStairs(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        return climbStairs(n-1) + climbStairs(n-2);
//
//    }

//        Space Optimization
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }
}
