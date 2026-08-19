class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val > key){ // go left
           root.left=deleteNode(root.left,key);
        }
        else if(root.val < key){ // gp right and delete
            root.right=deleteNode(root.right,key);
        }
        else{ 
            // if both null leaf node or if 1 child is null (left ya right)
            if(root.left==null && root.right==null) return null; // leaf node
            if(root.left!=null && root.right==null) return root.left; // left present return whole left tree
            if(root.right!=null && root.left==null) return root.right;// right present return right tree
        
            // if not leaf node or it have both left and right child
            TreeNode pred=root.left;// we have to delete the root so in place of the root val their is a val just smaller or larger than it so we calculate pred or succ both in my case i cal pred
            while(pred.right!=null) pred=pred.right;
            
            root.left=deleteNode(root.left,pred.val); // delete the original place where pred exits
            pred.left=root.left; // attach pred.left--> lst 
            pred.right=root.right; // attach pred.right--> rst
            return pred; // return pred(whole tree)

        }
        return root;
    }
}