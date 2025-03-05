package easy.matrix.transpoceMatrix;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        Solution solution=new Solution();
        System.out.println(Arrays.deepToString(solution.transpose(matrix)));
    }
}

