package ProjectGurgram.Leetcodes.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
int[] arr={3,2,2,3};
int val=3;

        System.out.println(removeElementNumber(arr,val));
    }

    static int removeElementNumber(int[] arr,int val){
        int count =0;

        for (int i=0;i<arr.length;i++){
            if (arr[i]!=val){
                arr[count]=arr[i];
                count++;
            }
        }
        return count;
    }
}
