class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            min=Math.min(i,min);
        }
        int minmove=0;
        for(int i:nums) minmove+=i-min;
        return minmove;
    }
}