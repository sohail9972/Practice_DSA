package ProjectGurgram.Leetcodes;

import java.util.ArrayList;
import java.util.List;

class findingmissingnumberinarray {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
                int correctindex= nums[i]-1;
                if(nums[i] != nums[correctindex]){
                    swappingfunction(nums,i,correctindex);
                }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int  j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }

    void swappingfunction(int[] nums, int first, int second) {
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}