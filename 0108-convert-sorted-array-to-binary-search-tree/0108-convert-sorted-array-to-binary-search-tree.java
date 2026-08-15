class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums,0,nums.length-1);
    }
    public TreeNode convert(int[] nums,int low,int high){
        if(low>high) return null;
        int mid=(low+high)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=convert(nums,low,mid-1);
        root.right=convert(nums,mid+1,high);
        return root;

    }
}