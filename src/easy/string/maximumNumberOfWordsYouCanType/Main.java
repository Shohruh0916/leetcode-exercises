package easy.string.maximumNumberOfWordsYouCanType;

public class Main {
    public static void main(String[] args) {
        String text= "leet code";
        String brokenLetters = "lt";
        Solution solution=new Solution();
        System.out.println(solution.canBeTypedWords(text,brokenLetters));
    }
}
