class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            boolean cousinx=false;
            boolean cousiny=false;
            for(int i=0;i<size;i++){
                TreeNode top=q.remove();
                if(top.left!=null && top.right!=null) {
                    if(top.left.val==x && top.right.val==y) return false;
                    if(top.left.val==y && top.right.val==x) return false;
                }
                if(top.val==x) cousinx=true;
                if(top.val==y) cousiny=true;
                if(top.left!=null) q.add(top.left);
                if(top.right!=null) q.add(top.right);
            }
            if(cousinx && cousiny) return true;
            if(cousinx || cousiny) return false;
        }
        return false;
    }
}