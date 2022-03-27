class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int r = mat.length;
        int c = mat[0].length;
        int[] ans = new int[k];
        for(int i=0;i<r;i++){
            int count = 0;
            for(int j=0;j<c;j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            mat[i][c-1] = count;
            mat[i][0] = i;
        }
        Arrays.sort(mat,(a,b) -> Integer.compare(a[mat[0].length-1],b[mat[0].length-1]));
        for(int i=0;i<k;i++) {
        	ans[i]=mat[i][0];
        }
        return ans;
    }
}
