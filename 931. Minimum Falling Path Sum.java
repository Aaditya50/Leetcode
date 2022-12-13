class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        
        int[][] dp = new int[101][101];
        for(int i=0;i<col;i++) dp[0][i] = matrix[0][i];
        for(int i=1;i<row;i++){
            for(int j=0;j<col;j++){
                int minsum=Integer.MAX_VALUE;
                if(i-1>=0) minsum = Math.min(minsum,dp[i-1][j]);
                if(i-1>=0 && j-1>=0) minsum = Math.min(minsum,dp[i-1][j-1]);
                if(i-1>=0 && j+1<col) minsum = Math.min(minsum,dp[i-1][j+1]);

                dp[i][j] = minsum+matrix[i][j];
            }
        }
        int ans = dp[row-1][0];
        for(int i=1;i<col;i++) ans = Math.min(ans,dp[row-1][i]);
        return ans;
    }
}
