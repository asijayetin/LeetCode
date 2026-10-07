class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            String[] arr=words[i].split("");
            boolean consist=true;
            for(int j=0;j<arr.length;j++){
                if(!allowed.contains(arr[j])){
                    consist=false;
                    break;
                }
            }
            if(consist) count++;
        }
        return count;

    }
}