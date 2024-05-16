package ProjectGurgram.Leetcodes;

public class missingnumberwithBitmanipulation {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        bitmani(arr);
    }
    static void bitmani(int[] arr){
        int index=0;
        for (int i=0;i<=arr.length;i++){
            index= index ^ i;
        }
        for (int num : arr){
            index = index ^ num;
        }
    }

}
