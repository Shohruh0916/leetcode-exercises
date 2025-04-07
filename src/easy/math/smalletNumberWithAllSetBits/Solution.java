package easy.math.smalletNumberWithAllSetBits;

public class Solution {
    public int smallestNumber(int n) {
        int num=n;
        while(true){
            if((num&(num+1))==0) {
                return num;
            }
            num++;
        }
    }
}
