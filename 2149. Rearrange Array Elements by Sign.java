class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] pos = new int[n/2];
        int[] neg = new int[n/2]; 
        int p = 0 , ne = 0 ;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[p++] = nums[i];
            }else{
                neg[ne++] = nums[i];
            }
        }
        
         p = 0 ;
         ne = 0  ;
        for(int i=0;i<n;i+=2){
            nums[i] = pos[p++];
            nums[i+1] = neg[ne++];
        }
        
        return nums;
    }
}
