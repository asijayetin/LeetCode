class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            Arrays.sort(grid[i]);
        }
        for(int i=0;i<grid[0].length;i++){
            int largest=Integer.MIN_VALUE;
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]>largest){
                    largest=grid[j][i];
                }
            }
            count+=largest;
        }
        return count;
    }
}