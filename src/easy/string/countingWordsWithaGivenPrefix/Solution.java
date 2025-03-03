package easy.string.countingWordsWithaGivenPrefix;

public class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        int a=pref.length();
        for(int i=0; i<words.length; i++) {
            if (words[i].length()>=a && words[i].substring(0,a).equals(pref)){
                count++;
            }
        }
        return count;
    }
}
