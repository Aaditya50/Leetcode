class MyQueue {
    
    Stack<Integer> pushs = new Stack<>();
    Stack<Integer> pops = new Stack<>();
    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        pushs.push(x);
    }
    
    private void cPs(){
        int size = pushs.size();
        for(int i=0;i<size;i++){
            int top = pushs.pop();
            pops.push(top);
        }
    }
    
    public int pop() {
        if(pops.isEmpty()){
            cPs();
        }
        return pops.pop();
    }
    
    public int peek() {
        if(pops.isEmpty()){
            cPs();
        }
        return pops.peek();
    }
    
    public boolean empty() {
        return pushs.isEmpty() && pops.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
