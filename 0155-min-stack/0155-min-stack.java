class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> stmin=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        st.push(value);
        if(stmin.size()==0 || value<stmin.peek()){
            stmin.push(value);
        }
        else stmin.push(stmin.peek());
    }
    
    public void pop() {
        st.pop();
        stmin.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
         
        
        return stmin.peek();
    }
   
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */