class Solution {
    public int countElements(int[] arr) {
        int n=arr.length;
        int count=0;
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            if(arr[i]>arr[0] && arr[i]<arr[n-1]) count++;
        }
        return count;
    }
}