package easy.arrays.separateTheDigitsInAnArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nums=new int[]{13,25,83,77};
        Solution solution=new Solution();
        System.out.println(Arrays.toString(solution.separateDigits(nums)));
    }
}
