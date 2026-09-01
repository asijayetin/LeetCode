class Solution{
    public List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)  map.put(n,map.getOrDefault(n,0)+1);
        permutations(nums.length,map,list,res);
        return res;
    }
    public void permutations(int n,HashMap<Integer,Integer> map,List<Integer> list,List<List<Integer>> res){
        if(list.size()==n){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int num:map.keySet()){
            if(map.get(num)==0) continue;
            list.add(num);
            map.put(num,map.get(num)-1);
            permutations(n,map,list,res);
            map.put(num,map.get(num)+1);
            list.remove(list.size()-1);
        }
    }
}