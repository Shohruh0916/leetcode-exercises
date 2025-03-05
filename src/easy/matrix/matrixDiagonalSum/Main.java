package easy.matrix.matrixDiagonalSum;

public class Main {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Solution solution=new Solution();
        System.out.println(solution.diagonalSum(mat));
    }
}
