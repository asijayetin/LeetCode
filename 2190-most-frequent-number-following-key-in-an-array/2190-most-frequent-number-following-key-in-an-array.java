class Solution {
    public int mostFrequent(int[] nums, int key) {
        int maxfreq=0;
        int ans=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                int next=nums[i+1];
                map.put(next,map.getOrDefault(next,0)+1);
            }
            
        }
        for(int ele:map.keySet()){
            if(map.get(ele)>maxfreq){
                 maxfreq=map.get(ele);
                ans=ele;
            }
           
        }
        return ans;
    }
}