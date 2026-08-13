class Solution {
    public int balancedStringSplit(String s) {
        int ans=0;
        int var=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L') var++;
            else var--;
            if(var==0) ans+=1;
        }
        return ans;
    }
}