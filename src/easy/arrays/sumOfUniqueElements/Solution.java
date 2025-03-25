package easy.arrays.sumOfUniqueElements;

public class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int [] a=new int[101];
        for(int num: nums){
            a[num]++;
        }
        for(int i=1; i<=100; i++) {
            if (a[i]==1) {
                sum+=i;
            }
        }
        return sum;
    }
}
