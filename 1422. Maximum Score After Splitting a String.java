class Solution {
    public int maxScore(String s) {
        int ans = 0;
        for(int i=1;i<s.length();i++){
            int k=0;
            for(int j=0;j<i;j++){
                if(s.charAt(j)=='0') k++;
            }
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)=='1') k++; 
            }
            ans=Math.max(ans,k);
        }
        return ans;
        
    }
}
