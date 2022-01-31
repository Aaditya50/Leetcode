class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int l = accounts.length;
        int r = accounts[0].length;
        for(int i=0;i<l;i++){
            int sum = 0;
            for(int j=0;j<r;j++){
                sum += accounts[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
