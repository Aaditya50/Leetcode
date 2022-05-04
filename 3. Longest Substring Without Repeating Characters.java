class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> ans = new HashMap<>();
        int count=0, max=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(ans.containsKey(c)){
                count=Math.max(count,ans.get(c)+1);
            }
            ans.put(c,i);
            max = Math.max(max, (i-count+1));
        }
        return max;
        
    }
}
