class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap();
        ans.put(0,-1);
        int m = 0 , c = 0 ;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0 ){
                c += -1;
            }else{
                c += 1;
            }
            
            
            if(ans.containsKey(c)){
                m = Maath.max(m,i-ans.get(c));
            }else{
                ans.put(c,i);
            }
        }
        return m;
    }
}
