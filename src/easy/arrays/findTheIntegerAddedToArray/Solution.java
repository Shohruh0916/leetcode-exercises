package easy.arrays.findTheIntegerAddedToArray;

import java.util.Arrays;

public class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int x=nums2[0]-nums1[0];
        for(int i=1; i<nums1.length; i++){
            if(nums2[i]-nums1[i]!=x){
                System.out.println("yoq");
            }
        }
        return x;
    }
}
