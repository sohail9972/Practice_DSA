package ProjectGurgram.Leetcodes.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductofArrayExceptSelf238 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(productExceptSelfoptimal(arr));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i=0;i<n;i++){
            int product=1;
            for (int j=0;j<n;j++){
                if(i==j) continue;
                product *= nums[j];
            }
            ans[i]=product;
        }
        return ans;
    }

    public static int[] productExceptSelfoptimal(int[] nums) {
            int n = nums.length;
            int[] ans = new int[n];
        Arrays.fill(ans,1);
        int current_value = 1;
        for (int i=0;i<n;i++){
            ans[i]*=current_value;
            current_value *= nums[i];
        }
        current_value =1;
        for (int i=n-1;i>=0;i--){
            ans[i]*=current_value;
            current_value *=nums[i];
        }
        return ans;
    }
}
