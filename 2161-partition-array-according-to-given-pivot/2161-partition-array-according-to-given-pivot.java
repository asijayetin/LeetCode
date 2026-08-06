class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> left=new ArrayList<>();
        ArrayList<Integer> right=new ArrayList<>();
        ArrayList<Integer> pivotarr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot) left.add(nums[i]);
            else if(nums[i]>pivot) right.add(nums[i]);
            else pivotarr.add(nums[i]);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.addAll(left);
        ans.addAll(pivotarr);
        ans.addAll(right);
        int[]arr=new int[ans.size()];
        for (int i=0;i<ans.size();i++) {
            arr[i]=ans.get(i);
        }
        return arr;
    }
}