class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int[][] rotateMatrix=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotateMatrix[i][j]=matrix[(n-1)-j][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=rotateMatrix[i][j];
            }
        }
    }
}
