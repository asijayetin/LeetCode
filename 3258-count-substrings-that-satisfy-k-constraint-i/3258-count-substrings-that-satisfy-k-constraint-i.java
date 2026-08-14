class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int left=0;
        int n=s.length();
        int count0=0;
        int count1=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1') count1++;
            else count0++;
            while(count1>k && count0>k){
                if(s.charAt(left)=='1') count1--;
                else count0--;
                left++;
            }
            ans+=(i-left+1);

        }
        return ans;
    }
}