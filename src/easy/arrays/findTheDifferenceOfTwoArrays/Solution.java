package easy.arrays.findTheDifferenceOfTwoArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result=new ArrayList<>();
        Set<Integer> num1 = new HashSet<>();
        Set<Integer> num2 = new HashSet<>();
        for(int num: nums1){
            num1.add(num);
        }
        for(int num: nums2){
            num2.add(num);
        }
        List<Integer> result1=new ArrayList<>();
        for(int num: num2){
            if(!num1.contains(num)){
                result1.add(num);
            }
        }
        List<Integer> result2=new ArrayList<>();
        for(int num: num1){
            if(!num2.contains(num)){
                result2.add(num);
            }
        }
        result.add(result2);
        result.add(result1);
        return result;
    }
}
