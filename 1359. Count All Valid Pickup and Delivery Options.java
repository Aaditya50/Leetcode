class Solution {
    public int countOrders(int n) {
        int mod = 1000000007;
        long ans = 1;
        
        for(int i = 2; i <= n; i++) {
            int prevLen = (i - 1) * 2;
            int newPos = ((prevLen + 1) * (prevLen + 2)) / 2;
            ans = (ans * newPos) % mod;
        }
        
        return (int)ans;
    }
}
