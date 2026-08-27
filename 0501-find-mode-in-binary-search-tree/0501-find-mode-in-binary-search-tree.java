/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:ans){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int maxfreq=0;
        for(int num:map.keySet()){
            if(map.get(num)>maxfreq){
                maxfreq=map.get(num);
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)==maxfreq){
                result.add(i);
            }
        }
        int[] finalans=new int[result.size()];
        for(int i=0;i<finalans.length;i++){
            finalans[i]=result.get(i);
        }
        return finalans;

    }
    public void inorder(TreeNode root,ArrayList<Integer> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
}