class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> minrow=new ArrayList<>();
        ArrayList<Integer> maxcol=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
       
        

        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
                min=Math.min(matrix[i][j],min);
            }
            minrow.add(min);
        }
        for(int i=0;i<m;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                max=Math.max(matrix[j][i],max);
            }
            maxcol.add(max);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int x:minrow){
            if(maxcol.contains(x)) ans.add(x);
        }
        return ans;
    }
}