package ProjectGurgram.Leetcodes.BasicMath;

public class PerfectNumber {
    public static void main(String[] args) {

    }
    public static boolean checkPerfectNumber(int num) {
      int sum = 0;
      for (int i=0;i<=num/2;i++){
          if (num%i==0){
              sum=sum+i;
          }
      }
      return sum==num;
    }
}
