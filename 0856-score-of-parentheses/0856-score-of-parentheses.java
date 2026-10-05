class Solution {
    public int scoreOfParentheses(String s) {
        int count=0;
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(char ch:s.toCharArray()){
            if(ch=='(') st.push(0);
            else {
                int top=st.pop();
                if(top==0){
                    count=1;
                }
                else{
                    count=2*top;
                }
                int finalans=st.pop();
                st.push(finalans+count);
            }
        }
        return st.pop();
        
        
    }
}