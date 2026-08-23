class Solution {
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                arr.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            ArrayList<Integer> sorted=new ArrayList<>(arr);
            Collections.sort(sorted);
            for(int i=0;i<size;i++){
                if(arr.get(i).equals(sorted.get(i))) continue;
                int j=i+1;
                while(!arr.get(j).equals(sorted.get(i))) j++;
                int temp=arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
                ans++;
            }
        }
        return ans;
    }
}