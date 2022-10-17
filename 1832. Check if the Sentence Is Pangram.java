class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] ans = new boolean[26];
        for(char ch:sentence.toCharArray()){
            int i = (int)(ch-'a');
            ans[i] = true;
        }
        for(boolean a:ans){
            if(!a) return false;
        }
        return true;
    }
}
