class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minp=0,maxp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                minp=i;
            }
            if(nums[i]>max){
                max=nums[i];
                maxp=i;
            }
        }
        
        int a = Math.max(minp,maxp)+1;
        int b=nums.length-Math.min(maxp,minp);
        int c=Math.min(minp,maxp)+1+(nums.length-Math.max(minp,maxp));
    
        return Math.min(Math.min(a,b),c);
    }
}
