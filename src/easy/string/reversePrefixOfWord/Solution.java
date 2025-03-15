package easy.string.reversePrefixOfWord;

public class Solution {
    public String reversePrefix(String word, char ch) {
        String s="";
        int index=0;
        for(int i=0; i<word.length(); i++){
            char s1=word.charAt(i);
            if(s1==ch){
                index=i;
                break;
            }
        }
        String str=word.substring(0,index+1);
        for(int i=str.length()-1;  i>=0; i--){
            char x=str.charAt(i);
            s+=x;
        }
        String str1=word.substring(index+1);
        return s+str1;
    }

}
