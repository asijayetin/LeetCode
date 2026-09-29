class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int evenfreq=-1;
        int maxfreq=0;
        for(int num:map.keySet()){
            if(num%2==0){
                int freq=map.get(num);
                 if(freq>maxfreq ||(freq==maxfreq &&num<evenfreq)){
                maxfreq=freq;
                evenfreq=num;
            }
            }
            
           
        }
        return evenfreq;
    }
}