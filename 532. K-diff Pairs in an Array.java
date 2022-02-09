class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> ans = new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            
            if(Arrays.binarySearch(nums,i+1,nums.length, nums[i]+k ) > 0)
                ans.add(nums[i]);
        }
        return ans.size();
    }
}
