package ProjectGurgram.Leetcodes.BasicMath;

public class Conversion_Of_Number_To_HexaDecimal {
    public static void main(String[] args) {
        System.out.println(toHex(45));
    }
    public static String toHex(int num) {
        if(num == 0) return "0";
        long val = num;
        if(num < 0) val = (long)(Math.pow(2,32) + num);
        StringBuilder res = new StringBuilder();
        while(val != 0){
            int remainder = (int) (val % 16);
            val = val/16;
            if(remainder >= 10) res.append((char)(remainder+87));
            else res.append(remainder);
        }
        return res.reverse().toString();
    }
}
