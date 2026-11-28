class MyQueue {
      Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
    public MyQueue() {
        st1=new Stack<>();
        st2=new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        if(st2.size()==0){
            while(st1.size()>0){
                st2.push(st1.pop());
            }
        }
        if(st2.size()==0) return -1;
        return st2.pop();
    }
    
    public int peek() {
        if(st2.size()==0){
            while(st1.size()>0){
                st2.push(st1.pop());
            }
        }
        if(st2.size()==0) return -1;
        return st2.peek();
    }
    
    public boolean empty() {
        return st1.size()==0 && st2.size()==0;
        
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