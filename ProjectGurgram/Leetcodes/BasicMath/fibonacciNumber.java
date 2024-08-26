package ProjectGurgram.Leetcodes.BasicMath;

import java.util.HashMap;
import java.util.Map;

public class fibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
    static Map<Integer,Integer> map = new HashMap<>(Map.of(0,0,1,1));
    public static int fib(int n) {
        if (map.containsKey(n)){
            return map.get(n);
        }
        map.put(n,fib(n-1)+fib(n-2));
        return map.get(n);
    }

}
