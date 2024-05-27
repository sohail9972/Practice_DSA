package ProjectGurgram.Patterns;

public class six {
    public static void main(String[] args) {
patter6(5);
    }
    static void patter6(int n){
        for (int i=1;i<=2*n-1;i++){
            int total_cols= i>n ? 2*n-i : i;

            int noofSpaces= n-total_cols;
            for (int space=1;space<=noofSpaces;space++){
                System.out.print(" ");
            }
            for (int j=1;j<=total_cols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
