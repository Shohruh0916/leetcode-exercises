package easy.string.countTheNumberOfVowelStrings;

public class Main {
    public static void main(String[] args) {
        String [] words=new String[]{"are","amy","u"};
        int left=0;
        int right=2;
        Solution solution=new Solution();
        System.out.println(solution.vowelStrings(words,left,right));
    }
}
