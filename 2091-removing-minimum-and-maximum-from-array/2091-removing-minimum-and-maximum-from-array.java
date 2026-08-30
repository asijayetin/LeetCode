class Solution {
    public int minimumDeletions(int[] nums) {
        int minmovesfromback=0; 
        int minmovesfromfront=0; // min from three conditions
        int minmovesfromfrontback=0;

        int minele=nums[0];
        int maxele=nums[0]; // min and max ele

        int minidx=0;
        int maxidx=0; // min and max idx
        
        int minmoves=0; // finalans
        for(int i=0;i<nums.length;i++){ // minele in array and its idx
            if(nums[i]<minele){
                minele=nums[i];
                minidx=i;
            }
        }
        for(int i=0;i<nums.length;i++){ // maxele in array and its idx
            if(nums[i]>maxele){
                maxele=nums[i];
                maxidx=i;
            } 
        }
        minmovesfromfront=Math.max(minidx,maxidx)+1; // remove both from front
        minmovesfromback=nums.length-Math.min(minidx,maxidx); // remove both from end
        minmovesfromfrontback=Math.min(minidx,maxidx)+1 + nums.length-Math.max(minidx,maxidx);  // remove one from end one from front
        minmoves=Math.min(minmovesfromfront,Math.min(minmovesfromback,minmovesfromfrontback)); // minmum of these three
        return minmoves;

    }
}