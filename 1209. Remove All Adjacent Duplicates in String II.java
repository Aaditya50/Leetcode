class Solution {
    public String removeDuplicates(String s, int k) {
//         Stack<Character> ans = new Stack<>();
//         StringBuilder res = new StringBuilder();
//         for(char ch:s.toCharArray()){
//             Stack<Character> dum = new Stack<>();
//             dum.push(ch);
//             while(!ans.isEmpty() && ans.peek() == ch){
//                 dum.add(ans.pop());
//             }
//             if(dum.size() != k){
//                 while(!dum.isEmpty()){
//                     ans.push(dum.pop());
//                 }
//             }
//         }
        
//         while(!ans.isEmpty()){
//             res.append(ans.pop());
//         }
//         return res.reverse().toString();
        Stack<int []> Master = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(!Master.isEmpty() && Master.peek()[0] == ch){
                Master.peek()[1]++;
            }
            else Master.push(new int[]{ch, 1});
            if(Master.peek()[1] == k) Master.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(!Master.isEmpty()){
            int top[] = Master.pop();
            while(top[1] --> 0)
                sb.append((char)top[0]);
        }
        return sb.reverse().toString();
    }
}
