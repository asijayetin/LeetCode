class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visited=new boolean[n];
        bfs(visited,rooms);
        for(boolean flag:visited){
            if(!flag) return false;
        }
        return true;
        
    }
    public void bfs(boolean[] visited,List<List<Integer>> rooms){
        int n=rooms.size();
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
        while(q.size()>0){
            int front=q.remove();
            for(int ele:rooms.get(front)){
                if(!visited[ele]){
                    q.add(ele);
                    visited[ele]=true;
                }
            }
            
        }

    }
}