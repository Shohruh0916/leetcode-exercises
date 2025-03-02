package easy.math.minimumElementAfterReplacement;

public class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int s=0,a=nums[i];
            while(a!=0 ){
                s+=a%10;
                a=a/10;
            }
            nums[i]=s;
            min=Math.min(min,nums[i]);
        }
        return min;
    }
}
