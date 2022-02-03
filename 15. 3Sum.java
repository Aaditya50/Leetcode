class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            if(nums[i]<=0){
                if(i == 0 || nums[i] != nums[i-1]){
                    int lo = i+1;
                    int hi = n-1;
                    int sum = -nums[i];
                    while(lo<hi){
                        if(nums[lo] + nums[hi] == sum){
                            ans.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                            while (lo < hi && nums[lo] == nums[lo + 1]) {
                                lo++;
                            }
                            while (lo < hi && nums[hi] == nums[hi - 1]) {
                                hi--;
                            }
                            lo++;
                            hi--;
                        }else if(nums[lo]+nums[hi] < sum){
                            lo++;
                        }else{
                            hi--;
                        }
                    }
                }
            }
        }
        
        return ans;
    }
}



