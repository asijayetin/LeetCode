class Solution {
    public int firstStableIndex(int[] nums, int k) {
        // int instabilityscore=-1;
        for(int i=0;i<nums.length;i++){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<=i;j++){
                max=Math.max(nums[j],max);
            }
            for(int j=i;j<nums.length;j++){
                min=Math.min(nums[j],min);
            }
            if(max-min<=k) return i;
        }
        return -1;


    }
}