class Solution {
    public int smallestIndex(int[] nums) {
        int smallestidx=-1;
        for(int i=0;i<nums.length;i++){
            if(i==digitsum(nums[i])) return i;
        }
        return smallestidx;
    }
    public int digitsum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}