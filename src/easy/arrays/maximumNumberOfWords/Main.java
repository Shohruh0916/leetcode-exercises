package easy.arrays.maximumNumberOfWords;

public class Main {
    public static void main(String[] args) {
        String [] sentences={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        Solution solution=new Solution();
        System.out.println(solution.mostWordsFound(sentences));
    }
}
