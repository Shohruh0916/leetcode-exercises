package easy.matrix.flippingAnImage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] image={{1,1,0},{1,0,1},{0,0,0}};
        Solution solution=new Solution();
        System.out.println(Arrays.deepToString(solution.flipAndInvertImage(image)));
    }
}
