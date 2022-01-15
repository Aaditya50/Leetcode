class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i=nums.length-1;i>1;i--){
            int le = 0;
            int ri = i-1;
            while(le<ri){
                if(nums[le]+nums[ri] > nums[i]){
                    ans += ri-le;
                    ri--;
                }else{
                    le++;
                }
            }
        }
        return ans;
    }
}
