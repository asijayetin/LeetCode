class Solution {
    public boolean exists(TreeNode root,TreeNode p){
        if(root==null) return false;
        if(root==p) return true;
        return exists(root.left,p) || exists(root.right,p);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p || root==q) return root;
        boolean pinleft=exists(root.left,p);
        boolean qinleft=exists(root.left,q);
        if(pinleft && qinleft) return lowestCommonAncestor(root.left,p,q);
        else if(!pinleft && !qinleft) return lowestCommonAncestor(root.right,p,q);
        else return root;
    }
}