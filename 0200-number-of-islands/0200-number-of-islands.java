class Solution {
    class Pair {
    int row;
    int col;
    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    bfs(i,j,visited,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public void bfs(int row,int col,boolean[][] visited,char[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(row,col));
        visited[row][col]=true;
        int[] dr={-1, 1, 0, 0};
        int[] dc={0, 0, -1, 1};
        
        while(q.size()>0){
            Pair front=q.remove();
            for(int k=0;k<4;k++){
                int r=front.row+dr[k];
                int c=front.col+dc[k];
                if(r>=0 && r<n && c>=0 && c<m && grid[r][c]=='1' && !visited[r][c]){
                    q.add(new Pair(r,c));
                    visited[r][c]=true;

                }
            }
        }
    }
}