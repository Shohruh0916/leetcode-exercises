package easy.math.findTheOfEncryptedIntegers;
class Solution {
    private int encrypt(int x) {
        int maxDigit=0,temp=x;
        while(temp>0){
            int digit=temp%10;
            if(digit>maxDigit){
                maxDigit=digit;
            }
            temp/=10;
        }
        int result=0;
        temp=x;
        while(temp>0){
            result=result*10+maxDigit;
            temp/=10;
        }
        return result;
    }

    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=encrypt(num);
        }
        return sum;
    }
}
