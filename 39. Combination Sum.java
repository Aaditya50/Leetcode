class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        getCombination(candidates,0,target,resultList,new ArrayList<Integer>());
        return resultList;
    }
    public void getCombination(int [] candidates,int start, int target, List<List<Integer>> resultList, List<Integer> temp){
        if(target<0){
                return;
        }
        if(target == 0) {
            resultList.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            target -= candidates[i];
            temp.add(candidates[i]);
            getCombination(candidates,i,target,resultList,temp);
            temp.remove(temp.size()-1);
            target += candidates[i];
        }
    }  
}
