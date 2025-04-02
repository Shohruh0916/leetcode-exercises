package easy.string.largest3SameDigitNumberInString;

public class Solution {
    public String largestGoodInteger(String num) {
        String s2="";
        for(int i=0;i<num.length()-2; i++){
            String s1=num.substring(i,i+3);
            if(s1.charAt(0)==s1.charAt(1) && s1.charAt(1)==s1.charAt(2)){
                if (s1.compareTo(s2)>0) {
                    s2=s1;
                }
            }
        }
        return s2;
    }
}
