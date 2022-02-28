class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            int start=nums[i];
            while(i<nums.length-1 && nums[i]+1==nums[i+1]) {
                i++;
            }
            if(start==nums[i]) {
                list.add(String.valueOf(start));
            } else {
                list.add(start+"->"+nums[i]);                            
            }
        }
        return list;
    }
}
