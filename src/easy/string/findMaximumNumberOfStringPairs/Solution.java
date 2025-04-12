package easy.string.findMaximumNumberOfStringPairs;

public class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for (int i=0; i<words.length; i++) {
            String s=new StringBuilder(words[i]).reverse().toString();
            for (int j=i + 1; j<words.length; j++) {
                if (words[j].equals(s)) {
                    count++;
                }
            }
        }
        return count;
    }
}
