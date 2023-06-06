class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length==1) return true;

        Set<Integer> set = new HashSet<Integer>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int val:arr){
            min = Math.min(val,min);
            max = Math.max(val,max);
            set.add(val);
        }

        int d = (max-min)/(arr.length-1);
        
        if(d==0 && min!=max){
            return false;
        }

        for(int i=0;i<arr.length;i++){
            int ai = min + i*d;
            if(set.contains(ai)==false) return false;
        }
        return true;
    }
}
