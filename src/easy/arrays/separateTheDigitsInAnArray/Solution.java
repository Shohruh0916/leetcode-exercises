package easy.arrays.separateTheDigitsInAnArray;

public class Solution {
    public int[] separateDigits(int[] nums) {
        int size=0;
        for(int i=0; i<nums.length; i++){
            int a=nums[i];
            size+=String.valueOf(a).length();
        }
        int [] result=new int [size];
        int index=0;
        for(int i=0; i<nums.length; i++){
            int num=nums[i];
            String str=String.valueOf(num);
            for(int j=0; j<str.length(); j++){
                result[index++]=str.charAt(j)-'0';
            }
        }
        return result;
    }
}
