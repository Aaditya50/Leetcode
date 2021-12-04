class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ngr[] = nextGreaterRight(nums2);
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<nums2.length;i++){
            hm.put(nums2[i],ngr[i]);
        }
        int ans[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i] = hm.get(nums1[i]);
        }
        return ans;
    }
    public static int[] nextGreaterRight(int[] nums) {
        Stack<Integer> st = new Stack<>();
        
        int ans[] = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(st.size()>0 && nums[i]>st.peek()){
                st.pop();
            }
            if(st.size() > 0){
                ans[i] = st.peek();
            }else{
                ans[i] = -1;
            }
            st.push(nums[i]);
        }
        return ans;
    }
}
