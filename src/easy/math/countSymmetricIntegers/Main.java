package easy.math.countSymmetricIntegers;

public class Main {
    public static void main(String[] args) {
        int low=1;
        int high=100;
        Solution solution=new Solution();
        System.out.println(solution.countSymmetricIntegers(low,high));
    }
}
