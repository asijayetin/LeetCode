class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        int min=Integer.MAX_VALUE;
        long secondmin = Long.MAX_VALUE;
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)<min) min=ans.get(i);
        }
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)!=min && ans.get(i)<secondmin) {
                secondmin=ans.get(i);
            }
        }
        if(secondmin==Long.MAX_VALUE) return -1;
        else return  (int) secondmin;
    }
    public void inorder(TreeNode root,ArrayList<Integer> ans){
        if(root==null) return ;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
}