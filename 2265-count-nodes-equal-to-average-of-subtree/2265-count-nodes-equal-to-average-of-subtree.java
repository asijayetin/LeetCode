class Solution {
    public int averageOfSubtree(TreeNode root) {
        if(root==null) return 0;
        int nodes=0;
        if(avg(root)==root.val) nodes++;
        nodes+=averageOfSubtree(root.left);
        nodes+=averageOfSubtree(root.right);
        return nodes;

    }
    public int avg(TreeNode root){
        ArrayList<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        int sum=0;
        for(int i=0;i<ans.size();i++){
            sum+=ans.get(i);
        }
        int average=sum/ans.size();
        return average;
    }
    public void inorder(TreeNode root,ArrayList<Integer> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
}