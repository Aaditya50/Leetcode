class Solution {
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int island=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j] == '1' ){
                    island++;
                    Island(grid,i,j);
                }
            }
        }
        return island;
    }
    
    public static void Island(char[][] grid,int i,int j){
        int r = grid.length;
        int c = grid[0].length;
        if(i>=r || j>=c || i<0 || j<0 || grid[i][j] == '0') return;
        else grid[i][j] = '0';
        
        Island(grid,i+1,j);
        Island(grid,i-1,j);
        Island(grid,i,j+1);
        Island(grid,i,j-1);
    }
}
