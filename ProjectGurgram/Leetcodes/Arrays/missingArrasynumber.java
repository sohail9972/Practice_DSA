package ProjectGurgram.Leetcodes.Arrays;

import java.util.ArrayList;
import java.util.List;

class missingnumbersinarray {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int i =0;
            while (i<nums.length){
                int correctindex = nums[i]-1;
                if (nums[correctindex] != nums[i]){
                    sawp(nums,i,correctindex);
                }else {
                    i++;
                }
            }
            List<Integer> ans = new ArrayList<>();
            for (int j=0;j<nums.length;j++){
                if (nums[j] != j+1){
                    ans.add(j+1);
                }
            }
            return ans;
        }
        void  sawp(int[] nums, int first, int second) {
            int temp= nums[first];
            nums[first]=nums[second];
            nums[second]=temp;
        }
    }


