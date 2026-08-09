class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        ArrayList<Integer> ans=new ArrayList<>();
    
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int bulb:bulbs){
            map.put(bulb,map.getOrDefault(bulb,0)+1);
        }
        for(int bulb:map.keySet()){
            if(map.get(bulb)%2==1){
                ans.add(bulb);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}