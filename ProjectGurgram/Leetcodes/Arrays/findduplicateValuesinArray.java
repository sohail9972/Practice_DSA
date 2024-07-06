package ProjectGurgram.Leetcodes.Arrays;

public class findduplicateValuesinArray {
    public static void main(String[] args) {
        int[] arr= new int[]{2,4,1,7,3,4,4};
//        int[] arr= {2,4,1,6,3,4,4};
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr){
        for (int i=0;i< arr.length;i++){
            int index=Math.abs(arr[i])-1;
            if (arr[index] <0){
                return Math.abs(arr[i]);
            }
            arr[index]=-arr[index];
        }
        return -1;
    }
}
