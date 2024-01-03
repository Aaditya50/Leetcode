class Solution {
    public int numberOfBeams(String[] bank) {
        int n=bank.length;
        int sum=0;
        int c=0;
        for(String s:bank){
            int c1=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1') c1++;
            }
            if(c1>0){
             sum += c*c1;
             c=c1;
            }  
        }
        return sum;
    }

}
