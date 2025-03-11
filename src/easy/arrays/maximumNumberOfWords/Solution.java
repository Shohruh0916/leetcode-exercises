package easy.arrays.maximumNumberOfWords;


public class Solution {
    public int mostWordsFound(String[] sentences) {
        int a=0;
        for (String sentence : sentences) {
            int b=sentence.split(" ").length;
            a=Math.max(a,b);
        }
        return a;
    }
}
