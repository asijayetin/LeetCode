class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<Double> ans=new ArrayList<>();
        q.add(root);
        while(q.size()>0){
            double sum=0;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode top=q.remove();
                sum+=top.val;
                if(top.left!=null) q.add(top.left);
                if(top.right!=null) q.add(top.right);
            }
            double avg=sum/size;
            ans.add(avg);
        }
        return ans;
    }
}