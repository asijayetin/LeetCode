class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] maxarr=new int[nums.length];
        int[] minarr=new int[nums.length];
        maxarr[0]=nums[0];
        minarr[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            maxarr[i]=Math.max(nums[i],maxarr[i-1]);
        }
        for(int i=nums.length-2;i>=0;i--){
            minarr[i]=Math.min(nums[i],minarr[i+1]);
            
        }
        for(int i=0;i<nums.length;i++) if(maxarr[i]-minarr[i]<=k) return i;
        return -1;
        
    } 
}