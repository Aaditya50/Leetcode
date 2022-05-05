class MyStack {
    Queue<Integer> main;
    Queue<Integer> dum;
    public MyStack() {
        main = new ArrayDeque<>();
        dum = new ArrayDeque<>();
    }
    
    public void push(int x) {
        main.add(x);
    }
    
    public int pop() {
        if(main.size() == 0) return -1;
        else{
            while(main.size()>1){
                dum.add(main.remove());
            }
            int a = main.remove();
            while(dum.size()>0){
                main.add(dum.remove());
            }
            return a;
        }
    }
    
    public int top() {
        if(main.size() == 0) return -1;
        else{
            while(main.size()>1){
                dum.add(main.remove());
            }
            int a = main.remove();
            dum.add(a);
            while(dum.size()>0){
                main.add(dum.remove());
            }
            return a;
        }
    }
    
    public boolean empty() {
        return main.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
