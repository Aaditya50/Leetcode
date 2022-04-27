class Solution {
    int[] group;
    void union(int a,int b){
        group[find(a)] = group[find(b)];
    }
    int find(int a){
        if(group[a]!=a){
            group[a] = find(group[a]);
        }
        return group[a];
    }
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        group = new int[s.length()];
        for(int i=0;i<group.length;i++){
            group[i] = i;
        }
        for(List<Integer> pair:pairs){
            union(pair.get(0),pair.get(1));
        }
        Map<Integer,Queue<Character> > groupChar = new HashMap<>();
        for(int i=0;i<s.length();i++){
            groupChar.putIfAbsent(find(i),new PriorityQueue<>());
            groupChar.get(find(i)).add(s.charAt(i));
        }
        StringBuilder op = new StringBuilder();
        for(int i=0;i<s.length();i++){
            op.append(groupChar.get(find(i)).poll());
        }
        return op.toString();
    }
}
