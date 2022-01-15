class Solution {
    
    boolean seen[][];
    
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0 ;
        int r = grid.length;
        int c = grid[0].length;
        seen = new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                max = Math.max(max,area(i,j,grid));
            }
        }
        return max;
    }
    
    public int area(int r,int c, int[][] grid){
        if(r<0 ||  r>=grid.length || c<0 ||c>=grid[r].length || seen[r][c] || (grid[r][c] ==0))
        {return 0;}
        
        seen[r][c] = true;
        
        return (1+area(r-1,c,grid)+area(r+1,c,grid)+area(r,c-1,grid)+area(r,c+1,grid));
    }
}
