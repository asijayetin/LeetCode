class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        return build(0,n-1,0,n-1,inorder,postorder);
    }
    public TreeNode build(int postlow,int posthigh,int inlow,int inhigh,int[] inorder, int[] postorder) {
        if(postlow>posthigh) return null;
        int val=postorder[posthigh];
        TreeNode root=new TreeNode(val);
        int r=0;
        for(int i=inlow;i<=inhigh;i++){
            if(inorder[i]==val){
                r=i;
                break;
            }
        }
        int cnt=r-inlow;
        root.left=build(postlow,postlow+cnt-1,inlow,r-1,inorder,postorder);
        root.right=build(postlow+cnt,posthigh-1,r+1,inhigh,inorder,postorder);
        return root;
    }

}