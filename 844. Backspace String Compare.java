class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> t1 = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '#'){
                if( !s1.isEmpty() ){
                    s1.pop();
                }
                continue;
            }
            s1.push(ch);
        }
        for(char ch : t.toCharArray()){
            if(ch == '#'){
                if( !t1.isEmpty() ){
                    t1.pop();
                }
                continue;
            }
            t1.push(ch);
        }
        String ans1 = "";
        String ans2 = "";
        while( !s1.isEmpty() ){
            ans1 += s1.pop();
        }
        while( !t1.isEmpty() ){
            ans2 += t1.pop();
        }
        return ans1.equals(ans2);
    }
}
