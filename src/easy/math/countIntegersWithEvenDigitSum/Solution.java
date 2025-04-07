package easy.math.countIntegersWithEvenDigitSum;

public class Solution {
    public int countEven(int num) {
        int count=0;
        int sum=0;
        for(int i=1; i<=num; i++){
            if(i>=10 && i<100 ){
                int x=i%10;
                int x1=i/10%10;
                sum+=x+x1;
            }else if(i>=100 && i<1000){
                int x=i%10;
                int x1=i/10%10;
                int x3=i/100%10;
                sum+=x+x1+x3;
            }else if(i<10){
                sum+=i;
            }else if(i==1000){
                int x4=i/1000%10;
                sum+=x4;
            }
            if(i>=sum && sum%2==0){
                count++;
            }
            sum=0;
        }
        return count;
    }
}
