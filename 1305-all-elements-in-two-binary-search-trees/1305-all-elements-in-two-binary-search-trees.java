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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans1=new ArrayList<>();
        List<Integer> ans2=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        inorder1(root1,ans1);
        inorder2(root2,ans2);
        Collections.sort(ans1);
        Collections.sort(ans2);
        int i=0;
        int j=0;
        while(i<ans1.size() && j<ans2.size()){
            if(ans1.get(i)<=ans2.get(j)){
                ans.add(ans1.get(i));
                i++;
            }
            else{
                ans.add(ans2.get(j));
                j++;
            }
        }
        while(i<ans1.size()){
            ans.add(ans1.get(i));
            i++;
        }
        while(j<ans2.size()){
            ans.add(ans2.get(j));
            j++;
        }
        return ans;
    }
    public void inorder1(TreeNode root1,List<Integer> ans1){
        if(root1==null) return;
        inorder1(root1.left,ans1);
        ans1.add(root1.val);
        inorder1(root1.right,ans1);
    }
    public void inorder2(TreeNode root2,List<Integer> ans2){
        if(root2==null) return;
        inorder2(root2.left,ans2);
        ans2.add(root2.val);
        inorder2(root2.right,ans2);
    }
}