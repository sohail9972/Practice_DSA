package ProjectGurgram.Leetcodes.Arrays;

public class maxAreaProblem {
    public static void main(String[] args) {
        int[] arr= {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] arr){
        int maxArea=0;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            maxArea =Math.max((maxArea),(right-left)*(Math.min(arr[left],arr[right])));
            if (arr[left]<arr[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }
}
