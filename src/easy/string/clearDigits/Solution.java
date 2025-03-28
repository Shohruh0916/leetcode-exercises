package easy.string.clearDigits;

public class Solution {
    public String clearDigits(String s) {
        String s2 = "";
        for(int i=0; i<s.length(); i++){
            char s1=s.charAt(i);
            if(Character.isDigit(s1)) {
                if(!s2.isEmpty()) {
                    s2=s2.substring(0,s2.length()-1);
                }
            }else{
                s2+=s1;
            }
        }
        return s2;
    }
}
