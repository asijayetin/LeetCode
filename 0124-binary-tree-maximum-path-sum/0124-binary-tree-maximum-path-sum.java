/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        int sum=levelsum(root);
        maxsum=Math.max(maxsum,sum);
        return maxsum;

    }
    public int levelsum(TreeNode root){
        if(root==null) return 0;
        int leftsum=Math.max(0,levelsum(root.left));
        int rightsum=Math.max(0,levelsum(root.right));
        maxsum=Math.max(leftsum+rightsum+root.val,maxsum);
        return root.val+Math.max(leftsum,rightsum);
    }

}