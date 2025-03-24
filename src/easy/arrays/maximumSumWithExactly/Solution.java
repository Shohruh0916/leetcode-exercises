package easy.arrays.maximumSumWithExactly;

public class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=nums[0];
        for(int i=0; i<nums.length; i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int sum=0;
        for(int i=0; i<k; i++){
            sum+=max;
            max+=1;
        }
        return sum;
    }
}
