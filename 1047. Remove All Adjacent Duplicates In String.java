class Solution {
    public String removeDuplicates(String s) {
        char[] ans = new char[s.length()];
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(j>0 && ans[j-1]==ch){
                j--;
            }else{
                ans[j]=ch;
                j++;
            }
        }
        return new String(ans,0,j);
    }
}
