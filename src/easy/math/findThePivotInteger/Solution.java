package easy.math.findThePivotInteger;

public class Solution {
    public int pivotInteger(int n) {
        int sum=n*(n+1)/2;
        int s1=0;
        for(int x =1; x<=n; x++) {
            s1+=x;
            if (s1==sum-s1+x) {
                return x;
            }
        }
        return -1;
    }
}
