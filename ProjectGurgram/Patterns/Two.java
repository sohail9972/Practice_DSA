package ProjectGurgram.Patterns;

public class Two {
    public static void main(String[] args) {
        patern2(5);
    }
    static void patern2(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
