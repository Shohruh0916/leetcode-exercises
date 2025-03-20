package easy.math.countPartitionsWithEvenSum;

public class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        int count=0,sum1=0;
        for(int i=0; i<nums.length-1; i++){
            if((sum-sum1)%2==0){
                count++;
            }
            sum-=nums[i];
            sum1+=nums[i];
        }
        return count;
    }
}
