package ProjectGurgram.Patterns;

public class seven {
    public static void main(String[] args) {
pattern7(5);
    }
    static void pattern7(int n){
        for (int i=1;i<=n;i++){
            int total_space= n-i;
            for (int space=1;space<=total_space;space++){
                System.out.print("  ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j + " ");
            }
//            for (int j=2;j<=i;j++){
//                System.out.print(j + " ");
//            }
            System.out.println();
        }
    }
}
