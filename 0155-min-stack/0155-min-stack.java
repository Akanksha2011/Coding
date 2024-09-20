class MinStack {
    Stack<Integer> st;
    Stack<Integer> st2;
    public MinStack() {
        st = new Stack<Integer>();
        st2 = new Stack<Integer>();
    }
    
    public void push(int val) {
        st.push(val);
        if(st2.size() == 0 || st2.peek() >= val)
        {
            st2.push(val);
        }
    }
    
    public void pop() {
        int x = st.pop();
        if(st2.size() != 0 && st2.peek() == x)
           st2.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return st2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */