package easy.matrix.transpoceMatrix;

public class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows=matrix.length;
        int col=matrix[0].length;
        int [][] matrix1=new int[col][rows];
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                matrix1[j][i]=matrix[i][j];
            }
        }
        return matrix1;
    }
}
