class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> finals = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        while(!map.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            List<Integer> temp1 = new ArrayList<>();
            for(Map.Entry<Integer,Integer> d:map.entrySet()){
                int key = d.getKey();
                int value = d.getValue();
                temp.add(key);
                value--;
                if(value==0) temp1.add(key);
                map.put(key,value);
            }
            finals.add(temp);
            for(int i:temp1) map.remove(i);
        }        
        return finals;
    }
}
