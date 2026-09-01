class Solution {
    public int findTilt(TreeNode root) {
        int ans[]={0};
        absdiff(root,ans);
        return ans[0]; 
    }
    public int absdiff(TreeNode root,int[] ans){
        if(root==null) return 0;
        int left=absdiff(root.left,ans);
        int right=absdiff(root.right,ans);
        ans[0]+=Math.abs(left-right);
        return left+right+root.val;
    }
}