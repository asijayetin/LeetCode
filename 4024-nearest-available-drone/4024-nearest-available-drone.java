class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int n=drones.length;
        int m=drones[0].length;
        int mindistance=Integer.MAX_VALUE;
        int minidx=-1;
        for(int i=0;i<n;i++){
            int distance=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            if(distance<=drones[i][2]){
                if(distance<mindistance){
                    mindistance=distance;
                    minidx=i;
                }
            }
        }
        return minidx;
        

    }
}