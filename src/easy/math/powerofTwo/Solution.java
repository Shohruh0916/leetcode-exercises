package easy.math.powerofTwo;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        int y=1;
        int daraja=0;
        while(y<n){
            y*=2;
            daraja++;
        }
        if(y==n){
            return true;
        }else{
            return  false;
        }
    }
}
