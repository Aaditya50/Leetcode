class Solution {
    public int maxSubArray(int[] nums) {
        int csum = 0;
        int osum = nums[0];
        for(int i=0;i<nums.length;i++){
            csum+= nums[i];
            if(csum > osum)osum = csum;
            if(csum < 0) csum = 0;
        }
        return osum;
    }
}
