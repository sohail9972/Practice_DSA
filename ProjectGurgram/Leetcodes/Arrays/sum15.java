package ProjectGurgram.Leetcodes.Arrays;

public class sum15 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 8, 9};
        int sum = 15;
        System.out.println(twopointer(arr, sum));

    }

//    public static int[] twopointer(int[] arr, int sum) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i ; j < arr.length; j++) {
//                if (arr[j] + arr[j-i] == sum) {
//                    return new int[]{j,j-i};
//                }
//            }
//        }
//        return null;
//    }

    public static int[] twopointer(int[] arr,int sum){
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if (arr[i]+arr[j+1]==sum){
                    return new int[]{i+1,j+1};
                } else if (arr[i]+arr[j]<sum) {
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return null;
    }

}

//    public static boolean maxSum15(int[] arr,int sum){
//        int ans=Integer.MIN_VALUE;
//        int current_sum=0;
//        for (int i=0;i<arr.length;i++){
//            current_sum+=arr[i];
//        }
//        if(current_sum>ans){
//            ans=current_sum;
//        }
//        if(current_sum<0){
//            current_sum=0;
//        }
//        return (ans==sum);
//    }
//}
