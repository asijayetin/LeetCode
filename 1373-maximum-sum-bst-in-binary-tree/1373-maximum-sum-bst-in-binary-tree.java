class Quad{
    int max;
    int min;
    boolean isBst;
    int sum;
    Quad(int max,int min,boolean isBst,int sum){
        this.max=max;
        this.min=min;
        this.isBst=isBst;
        this.sum=sum;
    }
}
class Solution {
    int maxsum;
    public int maxSumBST(TreeNode root) {
        maxsum=0;
        helper(root);
        return maxsum;
    }
    public Quad helper(TreeNode root){
        if(root==null) return new Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,true,0);
        Quad lst=helper(root.left);
        Quad rst=helper(root.right);
        int max=Math.max(root.val,Math.max(lst.max,rst.max));
        int min=Math.min(root.val,Math.min(lst.min,rst.min));
        int sum=root.val+lst.sum+rst.sum;
        boolean isBst=lst.isBst && rst.isBst && (lst.max<root.val && rst.min>root.val);
        if(isBst) maxsum=Math.max(sum,maxsum);
        return new Quad(max,min,isBst,sum);

    }
}