package ProjectGurgram.Leetcodes.BasicMath;

public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(12));

    }

    public static int hammingWeight(int n) {
        if (n <= 0) {
            return 0;
        }
        String str = Integer.toBinaryString(n);
        char[] ch = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == '1') {
                count++;
            }
        }
        return count;
    }
}

