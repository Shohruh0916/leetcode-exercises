package easy.string.countTheNumberOfVowelStrings;

public class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String s1;
        int count=0;
        for(int i=left; i<=right; i++){
            s1=words[i];
            for(int j=0; j<s1.length(); j++){
                char a=s1.charAt(0);
                char b=s1.charAt(s1.length()-1);
                if((a=='a' || a=='e' || a=='i' || a=='o' || a=='u') && (b=='a' || b=='e' || b=='i' || b=='o' || b=='u')){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
