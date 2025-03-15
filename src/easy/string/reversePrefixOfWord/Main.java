package easy.string.reversePrefixOfWord;

public class Main {
    public static void main(String[] args) {
        String  word = "abcdefd";
        char ch='d';
        Solution solution=new Solution();
        System.out.println(solution.reversePrefix(word,ch));
    }
}
