package easy.arrays.sumOfAllOddLengthSubarrays;

public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        int n=arr.length;
        for(int i=0; i<arr.length; i++) {
            for(int a=1; i+a<=n; a+=2) {
                for (int j=i; j<i+a; j++) {
                    sum+=arr[j];
                }
            }
        }
        return sum;
    }
}
