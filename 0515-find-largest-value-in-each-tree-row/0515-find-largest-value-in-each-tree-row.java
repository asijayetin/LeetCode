class Solution {
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        while(q.size()>0){
            int max=Integer.MIN_VALUE;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.remove(); 
                max=Math.max(max,curr.val); // level order traversal check max value at every level from that level 
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            ans.add(max); // add max value of all levels in ans arraylist
        }
        return ans;

    }
}