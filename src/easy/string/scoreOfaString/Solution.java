package easy.string.scoreOfaString;

public class Solution {
    public int scoreOfString(String s) {
        int a=0,sum=0;
        for(int i=0; i<s.length()-1; i++){
            char s1=s.charAt(i);
            char s3=s.charAt(i+1);
            a=Math.abs((int) s3-s1);
            sum+=a;
        }
        return  sum;
    }
}
