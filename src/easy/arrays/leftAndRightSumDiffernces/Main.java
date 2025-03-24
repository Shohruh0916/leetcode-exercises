package easy.arrays.leftAndRightSumDiffernces;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nums=new int[]{10,4,8,3};
        Solution solution=new Solution();
        System.out.println(Arrays.toString(solution.leftRightDifference(nums)));
    }
}
