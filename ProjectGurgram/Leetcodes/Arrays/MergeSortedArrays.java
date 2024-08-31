package ProjectGurgram.Leetcodes.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        merge(nums1,3,nums2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int mindex=m-1;
        int nindex=n-1;
        int rightPointer=m+n-1;
        while(nindex>=0){
            if (mindex>=0 && nums1[mindex]>nums2[nindex]){
                nums1[rightPointer]=nums1[mindex];
                mindex--;
            } else {
                nums1[rightPointer]=nums2[nindex];
                nindex--;
            }
            rightPointer--;
        }
    }
}
