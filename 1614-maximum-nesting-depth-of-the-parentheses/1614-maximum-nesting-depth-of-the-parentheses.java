class Solution {
    public int maxDepth(String s) {
        int openingch=0;
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') {
                openingch++;
                maxlen=Math.max(openingch,maxlen);
            }
            else if(ch==')') {
                openingch--;
            }
        }
        return maxlen;


    }
}