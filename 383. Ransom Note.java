class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {  
       int[] ans = new int[26];
        
        for(char c:magazine.toCharArray()){
            ans[c -'a']++;
        }
        
        for(char c:ransomNote.toCharArray()){
            if(ans[c-'a'] == 0){
                return false;
            }
            ans[c-'a']--;
        }
        return true;
    }
}
