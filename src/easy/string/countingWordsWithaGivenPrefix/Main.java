package easy.string.countingWordsWithaGivenPrefix;

public class Main {
    public static void main(String[] args) {
        String[] words=new String[]{"pay","attention","practice","attend"};
        String pref="at";
        Solution solution=new Solution();
        System.out.println(solution.prefixCount(words,pref));
    }
}
