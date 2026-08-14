class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1,root2);
    }
    public TreeNode merge(TreeNode root1,TreeNode root2){
        if(root1==null) return root2;
        if(root2==null) return root1;
        int rootman=root1.val+root2.val;
        TreeNode root=new TreeNode(rootman);
        root.left=merge(root1.left,root2.left);
        root.right=merge(root1.right,root2.right);
        return root;
    }
}