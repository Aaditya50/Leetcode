class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int x = matrix.length;
        int y = matrix[0].length;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
