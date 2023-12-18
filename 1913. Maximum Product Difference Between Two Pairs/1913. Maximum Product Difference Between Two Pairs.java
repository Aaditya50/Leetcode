class Solution {
    public int maxProductDifference(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int mul = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(max1<nums[i]){
                max2 = max1;
                max1 = nums[i];
            }else if(max2 < nums[i]){
                max2 = nums[i];
            }

            if(nums[i]<min1){
                min2 = min1;
                min1 = nums[i];
            }else if(nums[i]< min2 && min2!=min1){
                min2 = nums[i];
            }
        }
        System.out.println(max1+" "+max2+" "+min1+" "+min2);
        return (max1*max2)-(min1*min2);
    }
}
