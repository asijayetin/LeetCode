class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1=new ArrayList<>(); // arr1 to store first half
        ArrayList<Integer> arr2=new ArrayList<>(); // arr2 to store second half
        arr1.add(nums[0]); // as mention in question add 1st elemnt in arr1..
        arr2.add(nums[1]); // same in question mentioned add 2nd element in arr2..
        for(int i=2;i<nums.length;i++){ // iterate from index 2 to end
            if(arr1.get(arr1.size()-1)> arr2.get(arr2.size()-1)) arr1.add(nums[i]); // req condition
            else arr2.add(nums[i]);
        }
        for(int x:arr2){ // add all element of arr2 at end of arr1 (concatenate)
            arr1.add(x);
        }
        int[] result=new int[nums.length]; // final resultant array because we have to return an array not arraylist
        for(int i=0;i<result.length;i++){
            result[i]=arr1.get(i); // add element of arr1 in resultant array
        }
        return result;
        
    }
}