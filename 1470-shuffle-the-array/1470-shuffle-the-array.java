class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] firsthalf=new int[n];
        int [] secondhalf=new int[n];
        for(int i=0;i<n;i++){
            firsthalf[i]=nums[i];
            secondhalf[i]=nums[i+n];
        }
        int[] ans=new int[2*n];
        int j=0;
        for(int i=0;i<n;i++){
            ans[j]=firsthalf[i];
            j++;
            ans[j]=secondhalf[i];
            j++;
        }
        return ans;

    }
}