class Solution {
    public int longestConsecutive(int[] nums) {
        int length=0;
        HashMap<Integer,Boolean> ans = new HashMap<>();
        for(int val:nums){
            ans.put(val,true);
        }
        for(int val:nums){
            if(ans.containsKey(val-1) == true){
                ans.put(val,false);
            }
        }
        
        int mlen=0;
        for(int val:nums){
            if(ans.get(val) == true){
                int tlen=1;
                int tsp=val;
                while(ans.containsKey(tsp+tlen) == true){
                    tlen++;
                }
                mlen = Math.max(mlen,tlen);
            }
        }
        return mlen;
    }
}
