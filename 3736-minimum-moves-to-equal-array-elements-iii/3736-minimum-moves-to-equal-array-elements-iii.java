class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            int need=max-nums[i];
            ans+=need;
        }
        
        return ans;

    }
}