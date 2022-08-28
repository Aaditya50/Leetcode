class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        
        for(int i=0;i<r;i++){
            count(mat,i,0);
        }
        for(int j=1;j<c;j++){
            count(mat,0,j);
        }
        return mat;
    }
    
    public void count(int[][] mat,int r,int c){
        int m = mat.length;
        int n = mat[0].length;
        int i=r;
        int j=c;
        
        int[] map = new int[101];
        
        while(i<m && j<n){
            map[mat[i][j]]++;
            i++;j++;
        }
        
        i=r;j=c;
        for(int k=1;k<map.length;k++){
            while(map[k]>0){
                mat[i][j]=k;
                map[k]--;
                i++;j++;
            }
        }
        
        
    }
}
