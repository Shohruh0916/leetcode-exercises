package easy.arrays.kidsWithTheGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>();
        int max=0;
        for(int c: candies){
            if(c>max){
                max=c;
            }
        }
        for(int c: candies){
            result.add((extraCandies+c)>=max);
        }
        return result;
    }
}
