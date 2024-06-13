package ProjectGurgram.Leetcodes.BasicMath;

public class mathone {
    public static void main(String[] args) {
        extractionNumber(45786789);
    }
    static void extractionNumber(int n){
        while(n>0){
            int result = n%10;
            n=n/10;
            System.out.print(result);
        }

    }
}
