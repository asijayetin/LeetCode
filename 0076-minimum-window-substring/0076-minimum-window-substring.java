class Solution {
    public String minWindow(String s,String t) {
        int[] arr=new int[128];
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)]++;
        }
        int left=0;
        int right=0;
        int req=t.length();
        int start=0;
        int min=Integer.MAX_VALUE;
        while(right<s.length()){
            char ch=s.charAt(right);
            if(arr[ch]>0) req--;
            arr[ch]--;
            right++;
            while(req==0){
                if(right-left<min){
                    min=right-left;
                    start=left;
                }
                char leftChar=s.charAt(left);
                arr[leftChar]++;
                if(arr[leftChar]>0) req++;
                left++;
            }
        }
        if(min==Integer.MAX_VALUE) return "";
        return s.substring(start,start+min);
    }
}