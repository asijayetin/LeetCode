class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        while(q.size()>0){
            ArrayList<Integer> temp=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode top=q.remove();
                temp.add(top.val);

                if(top.left!=null) q.add(top.left);
                if(top.right!=null) q.add(top.right);
            }
           
            ans.add(temp);
            
        }
        Collections.reverse(ans);
        return ans;
    }
}