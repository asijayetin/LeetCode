class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int ans=0;
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode top=q.remove();
                if(i==0) ans=top.val;
                if(top.left!=null) q.add(top.left);
                if(top.right!=null) q.add(top.right);
            }
        }
        return ans;
    }
}