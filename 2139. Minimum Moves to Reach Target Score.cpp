class Solution {
public:
    int minMoves(int n, int maxDoubles) {

        int c=0;
        while(n>1){
            if(maxDoubles>0 && n%2==0){
                n/=2;
                maxDoubles--;
            }else{
                n--;
            }
            c++;
            if(maxDoubles==0) break;
        }
        return c+(n-1); 
    
    }
};
