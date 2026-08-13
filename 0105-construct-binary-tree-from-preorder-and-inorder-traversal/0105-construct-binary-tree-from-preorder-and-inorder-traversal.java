class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return build(0,n-1,0,n-1,preorder,inorder);
    }
    public TreeNode build(int prelow,int prehigh,int inlow,int inhigh,int[] preorder, int[] inorder) {
        if(prelow>prehigh) return null;
        int val=preorder[prelow];
        TreeNode root=new TreeNode(val);
        int r=0;
        for(int i=inlow;i<=inhigh;i++){ // locating the root we find from preorder in inorder
            if(inorder[i]==val) {
                r=i;
                break;
            }        
        }
        int cnt=r-inlow; // Number of elements in LST
        root.left=build(prelow+1,prelow+cnt,inlow,r-1,preorder,inorder);
        root.right=build(prelow+cnt+1,prehigh,r+1,inhigh,preorder,inorder);
        return root;
    }
}