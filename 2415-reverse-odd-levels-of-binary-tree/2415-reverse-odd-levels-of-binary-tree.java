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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int level=0;
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            ArrayList<TreeNode> ans=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode top=q.remove();
                ans.add(top);
                if(top.left!=null) q.add(top.left);
                if(top.right!=null) q.add(top.right);
            }
            if(level%2==1){
                int start=0;
                int end=ans.size()-1;            
                while(start<end){
                    int temp=ans.get(start).val;
                    ans.get(start).val=ans.get(end).val;
                    ans.get(end).val=temp;
                    start++;
                    end--;
                }
            }
            level++;
        }
        return root;
        

    }
}