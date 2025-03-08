package easy.arrays.sumOfVariableLengthSubarrays;

public class Solution {
    public int subarraySum(int[] nums) {
        int sum1=0;
        for(int i=0; i<nums.length; i++){
            int a=Math.max(0,i-nums[i]);
            for(int j=a; j<=i; j++){
                sum1+=nums[j];
            }
        }
        return sum1;
    }
}
