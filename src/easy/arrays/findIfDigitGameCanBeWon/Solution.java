package easy.arrays.findIfDigitGameCanBeWon;


public class Solution {
    public boolean canAliceWin(int[] nums) {
        int s1=0,s2=0,s=0;
        for(int i=0; i<nums.length; i++){
            if((nums[i]<10)){
                s1+=nums[i];
            }else if(nums[i]<100){
                s2+=nums[i];
            }else{
                s+=nums[i];
            }
        }
        return s1>s2+s || s2>s1+s;
    }
}
