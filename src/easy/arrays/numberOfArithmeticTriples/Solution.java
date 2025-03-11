package easy.arrays.numberOfArithmeticTriples;

public class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int s=0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                for(int k=0; k<nums.length; k++){
                    if((Math.abs(nums[k]-nums[j])==diff && k>j) && (Math.abs(nums[j]-nums[i])==diff && i<j)){
                        s++;
                    }
                }
            }
        }
        return s;
    }
}
