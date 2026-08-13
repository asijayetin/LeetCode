class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    boolean iabsj=Math.abs(arr[i]-arr[j])<=a;
                    boolean jabsk=Math.abs(arr[j]-arr[k])<=b;
                    boolean iabsk=Math.abs(arr[i]-arr[k])<=c;
                    if(iabsj && jabsk && iabsk) count++;
                }
            }
        }
        return count;
    }
}