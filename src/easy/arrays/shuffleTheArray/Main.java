package easy.arrays.shuffleTheArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n=3;
        int [] nums={2,5,1,3,4,7};
        Solution solution=new Solution();
        System.out.println(Arrays.toString(solution.shuffle(nums, n)));
    }
}
