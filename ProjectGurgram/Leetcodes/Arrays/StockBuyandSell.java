package ProjectGurgram.Leetcodes.Arrays;

public class StockBuyandSell {
    public static void main(String[] args) {
        int [] arr={7,1,5,3,6,4};
        System.out.println(sellAndBuy(arr));
    }
    public static int sellAndBuy(int[] arr){
        int profit=0;
        for (int i=0;i<arr.length-1;i++){
            if(arr[i+1]>arr[i]){
                profit = profit + arr[i+1]-arr[i];
            }
        }
        return profit;
    }
}
