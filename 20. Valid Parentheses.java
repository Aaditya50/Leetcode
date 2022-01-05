class Solution {
    public boolean isValid(String str) {
    Stack<Character> st = new Stack<>();
    
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        
        if(ch == '(' || ch =='{' || ch == '['){
            st.push(ch);
        }else{
            if(st.isEmpty()){
                return false;
            }else{
                char c = st.pop();
                if(ch == ')' && c != '('){
                    return false;
                }else if(ch == '}' && c != '{'){
                    return false;
                }else if(ch == ']' && c != '['){
                    return false;
                }
            }
        }
    }
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}

/*
Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
*/
