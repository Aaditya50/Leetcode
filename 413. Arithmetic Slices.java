class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3) return 0;
        int count=0;
        for(int i=2,j=0;i<nums.length;i++){
            count += (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) ? ++j : (j = 0);
        }
        return count;
    }
}
