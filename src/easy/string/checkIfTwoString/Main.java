package easy.string.checkIfTwoString;

public class Main {
    public static void main(String[] args) {
       String[] word1;
       word1=new String[]{"a","cb"};
       String [] word2;
       word2=new String[]{"ab","b"};
       Solution solution=new Solution();
       System.out.println(solution.arrayStringsAreEqual(word1,word2));
    }
}
