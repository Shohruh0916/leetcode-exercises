package easy.arrays.minimumNumberGame;

import java.util.Arrays;

public class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        for (int i=0; i<nums.length; i+=2) {
            if (i+1<nums.length) {
                result[i]=nums[i+1];
                result[i+1]=nums[i];
            }
        }
        return result;
    }
}
