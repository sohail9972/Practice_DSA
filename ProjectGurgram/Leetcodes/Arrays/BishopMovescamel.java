package ProjectGurgram.Leetcodes.Arrays;

public class BishopMovescamel {
    public static void main(String[] args) {
        System.out.println(bisshopCamelonChess(5,4));
    }

    public static int bisshopCamelonChess(int row,int col){
        return Math.min(row-1,col-1)+Math.min(row-1,8-col)+Math.min(8-row,col-1)+Math.min(8-row,8-col);
    }
}
