class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<Long> ans=new ArrayList<>();
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            long sum=0;
            for(int i=0;i<size;i++){
                TreeNode top=q.remove();
                sum+=top.val;
                if(top.left!=null) q.add(top.left);
                if(top.right!=null) q.add(top.right);
            }
            ans.add(sum);
        }
        if(ans.size()<k) return -1;
        Collections.sort(ans,Collections.reverseOrder());
        return ans.get(k-1);
    }
}