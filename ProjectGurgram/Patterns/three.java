package ProjectGurgram.Patterns;

public class three {
    public static void main(String[] args) {
        pattern3(5);
    }
    static void pattern3(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
