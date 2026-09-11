class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] posarr=new int[nums.length];
        int[] negarr=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                posarr[j]=nums[i];
                j++;
            }
        }
        j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                negarr[j]=nums[i];
                j++;
            }
        }
        int[] finalans=new int[nums.length];
        j=0;
        for(int i=0;i<nums.length/2;i++){
            finalans[j++]=posarr[i];
            finalans[j++]=negarr[i];
        }
        return finalans;
    }
}