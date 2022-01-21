class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int wantpe = 0;
        for(int i=0;i<gas.length;i++){
            wantpe += gas[i]-cost[i] ;
        }
        if(wantpe < 0) return -1;
        int cp = 0 , index = 0;
        for(int i=0;i<gas.length;i++){
            cp += gas[i]-cost[i] ;
            if(cp<0){
                index = i+1;
                cp = 0 ;
            }
        }
        return index;
    }
}
