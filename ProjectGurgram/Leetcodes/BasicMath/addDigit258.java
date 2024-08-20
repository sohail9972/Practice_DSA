package ProjectGurgram.Leetcodes.BasicMath;

public class addDigit258 {
    public static void main(String[] args) {
        System.out.println(addDigits(12));
    }
    public static int addDigits(int num) {
        if(num < 10){
            return num;
        }
        int result = 0;
        while(true){
            while(num > 0){
                result += num % 10;
                num = num / 10;
            }

            if(result < 10){
                break;
            }
            num = result;
            result = 0;
        }
        return result;
    }
}
