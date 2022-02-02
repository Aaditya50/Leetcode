class Solution {
    int[] smap , pmap;
    
    public boolean checkValid(){
        for(int i=0;i<26;i++)
            if(smap[i] != pmap[i]) return false;
        return true;
    }
    
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()) return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        
        int st = 0 , end = 0 , k = p.length();
        smap = new int[26];
        pmap = new int[26];
        
        for(char c:p.toCharArray()) 
            pmap[c-'a']++;
       
        while(end < s.length()){
            char ch = s.charAt(end);
            smap[ch-'a']++;
            
            if(end-st+1 < k){
                end++;
            }else{
                if(checkValid()) 
                {ans.add(st);}
                smap[s.charAt(st)-'a']--;
                st++;end++;
            }
        }
        return ans;
    }
}
    

