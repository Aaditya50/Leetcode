class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        if(numRows == 0) return ans;
        
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        ans.add(first_row);
        
        for(int i=1;i<numRows;i++){
            
            List<Integer> prev_row = ans.get(i-1);
            List<Integer> row = new ArrayList<>();
            
            row.add(1);
            
            for(int j=1;j<i;j++){
                row.add(prev_row.get(j-1)+prev_row.get(j));
            }
            
            row.add(1);
            ans.add(row);
        }
              
        return ans;
    }
}

/*

 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
*/
