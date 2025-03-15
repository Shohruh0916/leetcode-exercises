package easy.string.removeOutermostParentheses;

public class Main {
    public static void main(String[] args) {
        String s = "(()())(())";
        Solution solution=new Solution();
        System.out.println(solution.removeOuterParentheses(s));
    }
}
