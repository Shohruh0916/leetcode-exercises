package easy.string.uncommonWordsFromTwoSentences;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s1="apple apple";
        String s2="banana";
        Solution solution=new Solution();
        System.out.println(Arrays.toString(solution.uncommonFromSentences(s1, s2)));
    }
}
