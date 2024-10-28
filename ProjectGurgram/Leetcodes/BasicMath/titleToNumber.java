package ProjectGurgram.Leetcodes.BasicMath;

public class titleToNumber {
    public static void main(String[] args) {

        System.out.println(titleToNumber("ABD"));
    }

    public static int titleToNumber(String columnTitle) {
        int sum=0;
        int mult=1;

        for(int i=columnTitle.length()-1;i>=0;i--)
        {
            sum=sum+(columnTitle.charAt(i)-64)*mult;
            mult=mult*26;
        }
        return sum;
    }
}
