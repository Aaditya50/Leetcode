class Solution {
    public char findTheDifference(String s, String t) {
        char ch = 0;
        
        for(char i:s.toCharArray()){
            ch^=i;
        }
        for(char j:t.toCharArray()){
            ch^=j;    
        }
        return ch;
        
    }
}
