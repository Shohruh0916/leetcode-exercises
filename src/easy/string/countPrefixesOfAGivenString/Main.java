package easy.string.countPrefixesOfAGivenString;

public class Main {
    public static void main(String[] args) {
        String [] words=new String[]{"a","a"};
        String s="aa";
        Solution solution=new Solution();
        System.out.println(solution.countPrefixes(words,s));
    }
}
