package easy.math.ANumberAfterADoubleReversal;

public class Solution {
    public boolean isSameAfterReversals(int num) {
        int a1=0, temp=num;
        while(temp!=0){
            a1=a1*10+temp%10;
            temp/=10;
        }
        int b2=0,temp2=a1;
        while(temp2!=0){
            b2=b2*10+temp2%10;
            temp2/=10;
        }
        return num==b2;
    }
}
