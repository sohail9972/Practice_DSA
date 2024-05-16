package ProjectGurgram.Leetcodes;

public class setMismatch {
    public static void main(String[] args) {
int [] a ={1,2,2,4};
setmissmatching(a);
    }
    static int [] setmissmatching(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]){
                swapingfun(arr, i,correct);
            }else {
                i++;
            }
        }
        for (int j=0;j<arr.length;j++){
            if(arr[j] != j+1){
                return new int[] {arr[j],j+1};
            }
        }
        return new int [] {-1,-1};
    }

   static void swapingfun(int[] arr, int first, int second) {
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
