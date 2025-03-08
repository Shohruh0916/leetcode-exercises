package easy.arrays.buildArrayfromPermutation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nums={0,2,1,5,3,4};
        Solution solution=new Solution();
        System.out.println(Arrays.toString(solution.buildArray(nums)));
    }
}
