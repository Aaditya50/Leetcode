class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ans = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            ans.add(nums[i]);
        }
        
        for(int i=k;i<nums.length;i++){
            int val = nums[i];
            if(val>ans.peek()){
                ans.remove();
                ans.add(val);
            }
        }
        
        return ans.peek();
    }
}
