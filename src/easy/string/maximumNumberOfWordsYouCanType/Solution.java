package easy.string.maximumNumberOfWordsYouCanType;

public class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String [] str=text.split(" ");
        int count=0;
        for(int i=0; i<str.length; i++){
            boolean a=true;
            for(int j=0; j<brokenLetters.length(); j++){
                if(str[i].indexOf(brokenLetters.charAt(j))!=-1){
                    a=false;
                    break;
                }
            }
            if(a){
                count++;
            }
        }
        return count;
    }
}
