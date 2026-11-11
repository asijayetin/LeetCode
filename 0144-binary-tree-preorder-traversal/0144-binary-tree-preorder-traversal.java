class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        helper(root,ans);
        return ans;

    }
    public void helper(TreeNode root,ArrayList<Integer> ans){
       
        if(root==null) return;
        ans.add(root.val);
        helper(root.left,ans);
        
        helper(root.right,ans);
    }
}