package easy.arrays.shuffleString;

public class Main {
    public static void main(String[] args) {
        String s="codeleet";
        int [] indices=new int[]{4,5,6,7,0,2,1,3};
        Solution solution=new Solution();
        System.out.println(solution.restoreString(s,indices));
    }
}
