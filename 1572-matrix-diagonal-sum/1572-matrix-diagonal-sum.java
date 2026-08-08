class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int primary=0;
        int sum=0;
        int secondary=0;
        for(int i=0;i<n;i++){
            primary+=mat[i][i];
        }
        for(int i=0;i<n;i++){
            secondary+=mat[i][n-1-i];
        }
        if(n%2==1){
           return primary+secondary-mat[n/2][n/2];
        }
        return primary+secondary;
    }
}