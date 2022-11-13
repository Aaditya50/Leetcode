class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        String ans="";
        for(int k=0;k<arr.length;k++){
            if(!arr[k].isEmpty()){
                sb.insert(0,arr[k]);
                if(k<arr.length-1) sb.insert(0," ");
            }
        }
        return sb.toString();
    }
}
