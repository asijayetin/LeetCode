class Solution {
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<TreeNode> ans=new ArrayList<>();
        inorder(root,ans);
        TreeNode dummy=new TreeNode(0);
        TreeNode curr=dummy;
        for(TreeNode node:ans){
            node.left=null;
            curr.right=node;
            curr=curr.right;
        }
        return dummy.right;
    }
    public void inorder(TreeNode root,ArrayList<TreeNode> ans){
        if(root==null) return;

        inorder(root.left,ans);
        ans.add(root);
        inorder(root.right,ans);
    }
}