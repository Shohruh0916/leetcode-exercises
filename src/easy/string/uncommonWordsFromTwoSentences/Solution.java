package easy.string.uncommonWordsFromTwoSentences;

public class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String allWords=s1+" "+s2;
        String[]s=allWords.split(" ");
        String result="";
        for(int i=0;i<s.length;i++){
            int count=0;
            for(int j=0;j<s.length;j++){
                if(s[i].equals(s[j])){
                    count++;
                }
            }
            if(count==1){
                result+=s[i]+" ";
            }
        }
        return result.trim().split(" ");
    }
}
