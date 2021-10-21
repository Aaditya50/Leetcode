class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int left=0,top=1,c=0;
        int bottom=matrix.length;
        int right=matrix[0].length;
        int t = right*bottom;
        right--;bottom--;
        
        while(c<t){
            for(int i=left;i<=right && c<t;i++){
                result.add(matrix[left][i]);
                c++;
            }
            for(int i=top;i<=bottom && c<t;i++){
                result.add(matrix[i][right]);
                c++;
            }
            for(int i=right-1;i>=left && c<t;i--){
                result.add(matrix[bottom][i]);
                c++;
            }
            for(int i=bottom-1;i>=top && c<t;i--){
                result.add(matrix[i][left]);
                c++;
            }
            left++;
            top++;
            bottom--;
            right--;
           
        }
        return result;
    }
}
