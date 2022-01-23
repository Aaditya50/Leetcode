class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int maxi = nums[0] , mini = nums[0] ;
        int count = nums.length;
        for(int i:nums){
             maxi = Math.max(maxi,i);
             mini = Math.min(mini,i);
        }
        
        for(int n:nums){
            if(n==mini || n==maxi){
                count--;
            }
            
        }
        return count;
    }
}
