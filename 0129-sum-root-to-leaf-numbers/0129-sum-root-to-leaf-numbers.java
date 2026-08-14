class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root,""); // traverse dfs pass the root and empty string
    }
    public int dfs(TreeNode root,String path) {
        if(root==null) return 0; // base case if root null then return 0
        path=path+root.val; // add current root value to the root to current path
        if(root.left==null&&root.right==null) return Integer.parseInt(path); // leaf node if left and right null convert string into int using Integer.parseInt
        return dfs(root.left,path)+dfs(root.right,path); // recursive call to calculate sum of paths from left and right subtree
    }
}