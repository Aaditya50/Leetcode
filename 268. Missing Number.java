class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length,sum=0;
        int ans = (n*(n+1))/2;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        return ans-sum;
    }
}
