package easy.string.checkBalancedString;

public class Solution {
    public boolean isBalanced(String num) {
        int sum1=0,sum2=0;
        for(int i=0; i<num.length(); i++){
            char s=num.charAt(i);
            if(i%2==0 && Character.isDigit(s)){
                sum1+= s-'0';
            }else{
                sum2+=s-'0';
            }
        }
        return sum1==sum2;
    }
}
