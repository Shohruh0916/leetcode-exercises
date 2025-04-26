package easy.arrays.lastStoneWeight;

import java.util.Arrays;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        while(true) {
            Arrays.sort(stones);
            if(stones.length>1){
                int y=stones[n-1];
                int x=stones[n-2];
                if (x==0) {
                    return y;
                }
                stones[n-1]=y - x;
                stones[n-2]=0;
            }else{
                return stones[stones.length-1];
            }
        }
    }
}
