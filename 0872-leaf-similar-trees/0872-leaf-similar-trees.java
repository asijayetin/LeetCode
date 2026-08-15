class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> ans1=new ArrayList<>();
        ArrayList<Integer> ans2=new ArrayList<>();
        similar(root1,ans1);
        similar(root2,ans2);
        return ans1.equals(ans2);

    }
    public TreeNode similar(TreeNode root,ArrayList<Integer> ans){
        if(root==null) return null;
        if(root.left==null && root.right==null) ans.add(root.val);
        similar(root.left,ans);
        similar(root.right,ans);
        return root;
    }
}