class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st=new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ans);
                ans="";
            }
            else if(ch==')'){
                ans=st.pop()+new StringBuilder(ans).reverse().toString();
            }
            else ans+=ch;
        }
        return ans;
    }
}