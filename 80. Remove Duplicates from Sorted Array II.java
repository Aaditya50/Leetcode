class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        
        int i=2;
        for(int j=i;j<n;j++){
            if(nums[j] != nums[i-2])
                nums[i++] = nums[j];
        }
        
        return i;
    }
}
