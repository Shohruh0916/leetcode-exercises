package easy.string.percentageOfLetterInString;

public class Main {
    public static void main(String[] args) {
        String s="foobar";
        char letter='o';
        Solution solution=new Solution();
        System.out.println(solution.percentageLetter(s,letter));
    }
}
