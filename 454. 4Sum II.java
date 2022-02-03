class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

      
      
 // Brute Force Solutions
        int sum = 0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                for(int k=0;k<nums3.length;k++){
                    for(int l=0;l<nums4.length;l++){
                        if(nums1[i]+nums2[j]+nums3[k]+nums4[l] == 0){
                            sum++;
                        }
                    }
                }
            }
        }
        return sum;
      
      
  //Optimized using HashMap    
        Map<Integer, Integer> map = new HashMap<>();
        for(int k : nums3)
            for(int l : nums4)
                map.put(k + l, map.getOrDefault(k + l, 0) + 1);
        int no = 0;
        for(int i : nums1)
            for(int j : nums2)
                        no += map.getOrDefault(-(i + j), 0);
        return no;
        
    }
}

