package easy.string.checkIfWordEqualsSummationOfTwoWords;

public class Main {
    public static void main(String[] args) {
        String firstWord="acb";
        String secondWord="cba";
        String targetWord="cdb";
        Solution solution=new Solution();
        System.out.println(solution.isSumEqual(firstWord,secondWord,targetWord));
    }
}
