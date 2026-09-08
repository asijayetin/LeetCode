class Solution {
    public int countCommas(int n) {
        int digits=0;
        if(n<1000) digits+=0;
        for(int i=1;i<=n;i++){
            if(i>=1000) digits+=1;
        }
        return digits;
    }
}