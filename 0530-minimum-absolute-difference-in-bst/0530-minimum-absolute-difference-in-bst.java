class Solution {
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
      
        inorder(root,ans);
        int n=ans.size();
        int min=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
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