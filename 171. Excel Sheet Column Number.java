class Solution {
    public int titleToNumber(String c) {
        int ans = 0;
        for(int i=0;i<c.length();i++){
            ans = ans*26 + c.charAt(i)-'A'+1;
        }
        return ans;
    }
}
