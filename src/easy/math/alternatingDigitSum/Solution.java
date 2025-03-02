package easy.math.alternatingDigitSum;

public class Solution {
    public int alternateDigitSum(int n) {
        int sum=0,x=1,m=n;
        while(m>0){
            int a=m%10;
            sum+=a*x;
            x=-x;
            m=m/10;
        }
        return sum*-x;
    }
}
