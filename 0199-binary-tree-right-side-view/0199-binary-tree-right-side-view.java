
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode front=q.remove();
                if(i==size-1) ans.add(front.val);
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
            }
            
            
        }
        return ans;
    }
}