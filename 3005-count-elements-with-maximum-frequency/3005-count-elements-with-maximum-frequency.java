class Solution {
    public int maxFrequencyElements(int[] nums) {
        int countmax=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        for(int i:map.values()){
            max=Math.max(max,i);
        }
        int sum=0;
        for(int i:map.values()){
            if(i==max){
                sum+=i;
            }
        }
        return sum;
    }
}