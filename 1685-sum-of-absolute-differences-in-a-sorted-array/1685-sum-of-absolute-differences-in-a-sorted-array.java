class Solution{
    public int[] getSumAbsoluteDifferences(int[] nums){
        int n=nums.length;
        int[] ans=new int[n];
        int totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            int leftCount=i;
            int rightCount=n-i-1;
            int rightSum=totalSum-leftSum-nums[i];
            ans[i]=(nums[i]*leftCount-leftSum)+(rightSum-nums[i]*rightCount);
            leftSum+=nums[i];
        }
        return ans;
    }
}