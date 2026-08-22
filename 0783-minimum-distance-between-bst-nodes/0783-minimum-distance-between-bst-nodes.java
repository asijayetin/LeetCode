class Solution {
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        inorder(root,ans);
        for(int i=1;i<ans.size();i++){
            min=Math.min(min,ans.get(i)-ans.get(i-1));
        }
        return min;
    }
    public void inorder(TreeNode root,ArrayList<Integer> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
  
}