package easy.math.countTheDigits;

public class Solution {
    public int countDigits(int num) {
        int count=0;
        int s=num;
        while(s>0){
            int a=s%10;
            if(num%a==0 && a!=0){
                count++;
            }
            s=s/10;
        }
        return count;
    }
}
