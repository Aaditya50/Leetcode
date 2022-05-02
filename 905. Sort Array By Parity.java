class Solution {
    public int[] sortArrayByParity(int[] nums) {
        for(int j=0,i=0;i<nums.length;i++){
            if(nums[i]%2 == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }
}
