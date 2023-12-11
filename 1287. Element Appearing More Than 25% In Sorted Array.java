class Solution {
    public int findSpecialInteger(int[] arr) {
        int ans = 0;
        int count = 0;
        int fre = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
            if(count<map.get(a)){
                fre=a;
                count=map.get(a);
            }
        }
        if(count>=arr.length/4) ans=fre;
        return ans;
    }
}
