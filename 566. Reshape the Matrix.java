class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int column = mat[0].length;
        
        if((rows*column) != (r*c)) return mat;
        
        int[][] op = new int[r][c];
        int rn = 0 , cn = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                op[rn][cn] = mat[i][j];
                cn++;
                if(cn == c){
                    cn = 0;
                    rn++;
                }
            }
        }
        return op;
        
    }
}


/*
Example 1:


Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]
Example 2:


Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]
*/
