package easy.string.percentageOfLetterInString;

public class Solution {
    public int percentageLetter(String s, char letter) {
        int count1=0;
        for(int i=0; i<s.length(); i++){
            char s1=s.charAt(i);
            if(s1==letter){
                count1++;
            }
        }
        return count1*100/s.length();
    }
}
