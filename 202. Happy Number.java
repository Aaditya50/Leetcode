class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==10 )return true;
        
        int count=0,num=n;
        while(n>1){
            n = sum(n);
            count++;
            if(n==1||n==10||n==100||n==1000||n==10000||n==100000)  return true;  
            else if(n==num/10||count==20) return false;
        }
        return false;
    }
    public int sum(int n){
        int sum=0;
        while(n>0){
            int rem = n%10;
            sum += rem*rem;
            n = n/10;
        }
        return sum;
    }
}
