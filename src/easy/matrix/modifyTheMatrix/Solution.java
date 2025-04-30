package easy.matrix.modifyTheMatrix;

public class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int j=0; j<cols; j++){
            int max=Integer.MIN_VALUE;
            for(int i=0; i<rows; i++){
                if(matrix[i][j]!=-1){
                    max=Math.max(max,matrix[i][j]);
                }
            }
            for(int i=0; i<rows; i++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=max;
                }
            }
        }
        return matrix;
    }
}
