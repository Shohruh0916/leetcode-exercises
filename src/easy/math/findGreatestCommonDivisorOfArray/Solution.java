package easy.math.findGreatestCommonDivisorOfArray;

public class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0],min=nums[1];
        for(int i=0; i<nums.length; i++){
            if(max<nums[i]){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }
        int result=0;
        for(int i=1; i<=max; i++){
            if(max%i==0 && min%i==0){
                result=i;
            }
        }
        return result;
    }
}
