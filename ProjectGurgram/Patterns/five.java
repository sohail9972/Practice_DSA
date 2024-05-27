package ProjectGurgram.Patterns;

public class five {
    public static void main(String[] args) {
pattern5(5);
    }
    static void pattern5(int n){
        for (int i=1;i<=2*n-1;i++){
            int totalRows= i > n ? 2*n-i : i;
            for (int j=1;j<=totalRows;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
