class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        int sum=0;
        dfs(root,ans);
        for(int i=0;i<ans.size();i++){
            sum+=ans.get(i);
        }
        return sum;
    }
    public void dfs(TreeNode root,ArrayList<Integer> ans){
        if(root==null) return ;
        if(root.left!=null){
            if(root.left.left==null && root.left.right==null) ans.add(root.left.val);
        }
        dfs(root.left,ans);
        dfs(root.right,ans);

    }
}