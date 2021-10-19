class Solution {
    public String toLowerCase(String s) {
        String str = new String(s);
        for(int i=0;i<s.length();i++){
           if(Character.isUpperCase(s.charAt(i))){
		        str =  s.toLowerCase(); 
           }
        }
       return str;
        
    }
}
