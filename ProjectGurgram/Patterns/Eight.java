package ProjectGurgram.Patterns;

public class Eight {
    public static void main(String[] args) {
        pattern8(5);
    }

    static void pattern8(int n) {
        for (int i = 1; i <= 2*n; i++) {
            int c = i>n? 2*n-i:i;


            for (int space = 0; space < n-c; space++) {
                System.out.print("  ");
            }
            for (int j = c; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= c; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
