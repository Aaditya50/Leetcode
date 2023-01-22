class Solution {
    public List<List<String>> partition(String s) {
       List<List<String>> res = new ArrayList<>();
       List<String> ans = new ArrayList<>();
       insert(0,s,ans,res);
       return res;
    }
    public void insert(int index,String s,List<String> ans , List<List<String>> res){
       if(index==s.length()){
            res.add(new ArrayList<>(ans));
            return;   
       }
       for(int i=index;i<s.length();i++){
           
            if(isValid(s,index,i)){
                ans.add(s.substring(index,i+1));
                insert(i+1,s,ans,res);
                ans.remove(ans.size()-1);
            }
       }
    }
    public boolean isValid(String s,int i, int j){
        boolean ans=true;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                ans= false;
            }
                i++;j--;
            
        }
        return ans;
    }
}
