package easy.arrays.divdeArrayIntoEqualPairs;

public class Solution {
    public boolean divideArray(int[] nums) {
        int[] a=new int[501];
        for(int num: nums){
            a[num]++;
        }
        for(int count: a){
            if(count%2!=0){
                return false;
            }
        }
        return true;
    }
}
