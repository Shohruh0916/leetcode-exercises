package easy.arrays.numberOfArithmeticTriples;

public class Main {
    public static void main(String[] args) {
        int [] nums={0,1,4,6,7,10};
        int diff=3;
        Solution solution=new Solution();
        System.out.println(solution.arithmeticTriplets(nums,diff));
    }
}
