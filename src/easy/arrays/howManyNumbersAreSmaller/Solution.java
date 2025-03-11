package easy.arrays.howManyNumbersAreSmaller;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] a=new int[nums.length];
        int s=0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<a.length; j++){
                if(nums[j]<nums[i] && i!=j){
                    s++;
                }
            }
            a[i]+=s;
            s=0;
        }
        return a;
    }
}
