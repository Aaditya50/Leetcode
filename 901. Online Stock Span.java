class StockSpanner {
    static class pair{
        int price;
        int index;
    }

    Stack<pair> s;
    int t=0;
    public StockSpanner() {
        s = new Stack<>();
        pair p = new pair();
        p.price = 100000;
        p.index=-1;
        s.push(p);
    }
    
    public int next(int price) {
        pair p = new pair();
        p.price = price;
        p.index = t;
        t++;

        while(s.peek().price <= p.price){
            s.pop();
        }
        int ans = p.index - s.peek().index;
        s.push(p);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
