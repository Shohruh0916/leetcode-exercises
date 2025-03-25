package easy.arrays.countEqualAndDivisible;

public class Main {
    public static void main(String[] args) {
        int[] nums=new int[]{5,5,9,2,5,5,9,2,2,5,5,6,2,2,5,2,5,4,3};
        int k=7;
        Solution solution=new Solution();
        System.out.println(solution.countPairs(nums,k));
    }
}
