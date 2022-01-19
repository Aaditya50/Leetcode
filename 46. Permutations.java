class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        ans(res,nums,new ArrayList());
        return res;
    }
    
    public void ans(List<List<Integer>> res, int[] nums , List<Integer> curr){
        
        if(curr.size() == nums.length){
            // curr.add(nums);
            res.add(new ArrayList(curr));
        }else{
            for(int i=0;i<nums.length;i++){
                if(curr.contains(nums[i]))
                    continue;
                curr.add(nums[i]);
                ans(res,nums,curr);
                curr.remove(curr.size()-1);
            }
        }
    } 
    
}
