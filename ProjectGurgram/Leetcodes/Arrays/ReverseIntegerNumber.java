package ProjectGurgram.Leetcodes.Arrays;

import java.sql.SQLOutput;

public class ReverseIntegerNumber {
    public static void main(String[] args) {
        System.out.println(reverse(-2148));
    }

    public static int reverse(int x) {
        int min =Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int res = 0;

        while (x!=0){
            int digit = x %10;
            x = x/10;
            if ((res>(max/10)) || (res==(max/10)) && digit>=max%10){
                return 0;
            }
            if ((res <(min/10)) || (res==(min/10)) && digit<=min%10){
                return 0;
            }
            res = (res*10) + digit;
        }
return res;

    }
}
