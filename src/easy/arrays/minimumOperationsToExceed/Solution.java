package easy.arrays.minimumOperationsToExceed;

public class Solution {
    public int minOperations(int[] nums, int k) {
        int s=0;
        for(int i=0;i<nums.length; i++){
            if(k>nums[i]){
                s++;
            }
        }
        return s;
    }
}
