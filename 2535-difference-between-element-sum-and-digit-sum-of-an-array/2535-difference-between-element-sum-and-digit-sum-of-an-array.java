class Solution {
    public int differenceOfSum(int[] nums) {
        int digsum=digitsum(nums);
        int arrsum=arraysum(nums);
        return arrsum-digsum;
    }
    public int digitsum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            while(n>0){
                sum+=n%10;
                n=n/10;
            }
        }
        return sum;
    }
    public int arraysum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
}