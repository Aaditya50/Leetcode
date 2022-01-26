class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        int a=0,b=0;
        for (int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                sum=nums[i]+nums[j];
                if(sum==target)
                {
                    a=i;
                    b=j;
                }
            }
        }
        return new int[] {a,b};
    }
}
