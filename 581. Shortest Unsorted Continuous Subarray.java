class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] help = nums.clone();
        Arrays.sort(help);
        int c=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]==help[i] && nums[j] == help[j]){
                i++;j--;
            }else if(nums[i] == help[i]){
                i++;
            }else if(nums[j] == help[j]){
                j--;
            }else{
                return j-i+1;
            }
        }
        return 0;
    }
}
