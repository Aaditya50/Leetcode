class Solution {
    public boolean makeEqual(String[] words) {
        String s = "";
        for(String a:words){
            s+=a;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(char k:map.keySet()){
            int val = map.get(k);
            
            if((val % words.length)!=0){
                return false;
            }
        }
        return true;
    }
}
