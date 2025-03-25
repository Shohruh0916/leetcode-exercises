package easy.arrays.numberOfStringsThatAppearAsSubstring;

public class Main {
    public static void main(String[] args) {
        String word="abc";
        String [] patterns= new String[]{"a","abc","bc","d"};
        Solution solution=new Solution();
        System.out.println(solution.numOfStrings(patterns,word));
    }
}
