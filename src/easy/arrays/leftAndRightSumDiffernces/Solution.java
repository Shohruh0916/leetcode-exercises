package easy.arrays.leftAndRightSumDiffernces;

public class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] result=new int[nums.length];
        int leftSum=0;
        int[] left=new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            left[i]=leftSum;
            leftSum+=nums[i];
        }
        int rightSum=0;
        for (int i=nums.length-1; i>=0; i--) {
            result[i]=Math.abs(left[i]-rightSum);
            rightSum+=nums[i];
        }
        return result;
    }
}
