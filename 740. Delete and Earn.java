class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = nums.length,max=0;
        int[] ans = new int[10001];
        for(int i=0;i<n;i++){
            ans[nums[i]]++;
            max = Math.max(max,nums[i]);
        }
        int in =  0, ex = 0;
        for(int i=0;i<=max;i++){
            int m = ex + (i*ans[i]);
            int x = Math.max(in,ex);
            in = m;
            ex = x;
        }
        return Math.max(in,ex);
        
    }
}
