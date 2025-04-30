package easy.matrix.modifyTheMatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] matrix=new int[][]{{1,2,-1},{4,-1,6},{7,8,9}};
        Solution solution=new Solution();
        System.out.println(Arrays.deepToString(solution.modifiedMatrix(matrix)));
    }
}
