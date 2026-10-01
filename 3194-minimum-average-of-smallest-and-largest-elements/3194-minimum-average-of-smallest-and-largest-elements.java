class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double minavg=Double.MAX_VALUE;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            double avg=(nums[left]+nums[right])/2.0;
            minavg=Math.min(avg,minavg);
            left++;
            right--;
        }
        return minavg;
    }
}