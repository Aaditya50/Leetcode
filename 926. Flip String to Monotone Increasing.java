class Solution {
    public int minFlipsMonoIncr(String s) {
        int countOne=0;
        int countZero=0;


        int i=0;

        while(i<s.length()){
            
            char ch = s.charAt(i);

            if(ch=='0') countZero++;
            else countOne++;
            if(countOne<countZero) countZero=countOne;
            i++;
        }

        return countZero;
    }
}
