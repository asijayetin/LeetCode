class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int i=0;
        int j=0;
        while(i<word1.length() || j<word2.length()){
            if(i<word1.length()){
                char ch1=word1.charAt(i);
                ans+=ch1;
                i++;
            }
            if(j<word2.length()){
                char ch2=word2.charAt(j);
                ans+=ch2;
                j++;
            }
        }
        return ans;
    }
}