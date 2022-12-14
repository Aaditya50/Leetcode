class Solution {
    public int rob(int[] nums) {
        return dynamic(nums);
    }

    public int dynamic(int[] nums){
        int n = nums.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i=1;i<n;i++){
            int in = dp[i-1]+nums[i];
            int ex = dp[i]+0;
            dp[i+1] = Math.max(in,ex);
        }

        return dp[n];
    }
}
