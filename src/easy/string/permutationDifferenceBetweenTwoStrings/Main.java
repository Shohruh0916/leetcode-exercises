package easy.string.permutationDifferenceBetweenTwoStrings;

public class Main {
    public static void main(String[] args) {
        String s="abcde";
        String t="edbac";
        Solution solution=new Solution();
        System.out.println(solution.findPermutationDifference(s,t));
    }
}
