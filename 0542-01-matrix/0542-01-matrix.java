class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        Queue<Pair> q=new LinkedList<>();
        int n=mat.length;
        int m=mat[0].length;
        boolean[][] visited=new boolean[n][m];
        int[][] ans = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    visited[i][j]=true;
                    q.add(new Pair(i,j));
                }
            }
        }
        while(q.size()>0){
            Pair front=q.remove();
            int[] dr={-1,1,0,0};
            int[] dc={0,0,-1,1};
            for(int k=0;k<4;k++){
                int r=front.row+dr[k];
                int c=front.col+dc[k];
                if(r>=0 && r<n && c>=0 && c<m && !visited[r][c]){
                    ans[r][c]=ans[front.row][front.col]+1;
                    visited[r][c]=true;
                    q.add(new Pair(r,c));


                }
            }
        }
        return ans;
    }
}