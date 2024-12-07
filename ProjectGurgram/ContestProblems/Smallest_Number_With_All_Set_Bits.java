package ProjectGurgram.ContestProblems;

public class Smallest_Number_With_All_Set_Bits
{
    public static void main(String[] args) {
        System.out.println(smallestNumber(5));
    }
    public static int smallestNumber(int n) {

        int num = 0;
        for (int i = 0; n>0; i++) {
            num = num | (1 << i);
            n = n >> 1;
        }
        return num;
    }
}
