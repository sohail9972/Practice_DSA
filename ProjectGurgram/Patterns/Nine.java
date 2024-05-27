package ProjectGurgram.Patterns;

public class Nine {
    public static void main(String[] args) {
pattern9(4);
    }
    static void pattern9(int n){
        int originalVal= n;
        n=2*n;
        for (int i=0;i<=n;i++){
            for (int j=0;j<=n;j++){
                int everyIndex= originalVal-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(everyIndex);
            }
            System.out.println();
        }
    }
}
