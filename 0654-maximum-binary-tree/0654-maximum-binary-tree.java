class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(0,nums.length-1,nums); // traverse to all array from left to right (i to j)
    }
    public TreeNode helper(int i,int j,int[] nums){
        if(i>j) return null; // base case low>high means loop finish return null
        int maxidx=i; // initially take maxidx to low
        for(int k=i+1;k<=j;k++){
            if(nums[k]>nums[maxidx]) maxidx=k; // find maxidx in nums
        }
        TreeNode root=new TreeNode(nums[maxidx]); // give value at maxidx at root (largest value)
        root.left=helper(i,maxidx-1,nums); // recursively call to left and recursion(magic) do all stuff
        root.right=helper(maxidx+1,j,nums); // same for right (recusrion)
        return root; // return final root
    }

}