class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int maxsum=0;
        for(int i=0;i<k;i++)  maxsum+=nums[i];
        int minsum=0;
        for(int i=nums.length-k;i<nums.length;i++) minsum+=nums[i];
        int absdiff=Math.abs(maxsum-minsum);
        return absdiff;
    }
}