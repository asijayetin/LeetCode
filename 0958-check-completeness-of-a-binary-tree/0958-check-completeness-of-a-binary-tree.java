class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean isnull=false;
        while(q.size()>0){
            TreeNode curr=q.remove();
            if(curr==null) isnull=true;
            else{
                if(isnull) return false;
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return true;
    }
}