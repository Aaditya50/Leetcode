class Solution {
    public int numberOfSteps(int num) {
        int m = num;
        int c=0;
        while(m!=0){
            if(m%2==0){
                m/=2;
                c++;
            }else{
                m-=1;
                c++;
            }
        }
        return c;
    }
}
