class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int ans = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<differences.length;++i){
            ans += differences[i];
            min = Math.min(min,ans);
            max = Math.max(max,ans);
        }
        
        for(int i=lower;i<=upper;++i){
            int low = i+min;
            int high = i+max;
            
            if(low >= lower && high <= upper){
                count++;
            }
        }
        return count;
    }
}
