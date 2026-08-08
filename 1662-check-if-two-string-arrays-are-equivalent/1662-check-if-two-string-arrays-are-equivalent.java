class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sum1="";
        String sum2="";
        for(int i=0;i<word1.length;i++) sum1+=word1[i];
        for(int i=0;i<word2.length;i++) sum2+=word2[i];
        if(sum1.equals(sum2)) return true;
        return false;
    }
}