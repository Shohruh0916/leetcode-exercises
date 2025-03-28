package easy.string.countAsterisks;

public class Solution {
    public int countAsterisks(String s) {
        int count=0;
        boolean a=false;
        for(int i=0; i<s.length(); i++){
            char s1=s.charAt(i);
            if('|'==s1){
                a=!a;
            }else if(s1=='*' && !a){
                count++;
            }
        }
        return count;
    }
}
